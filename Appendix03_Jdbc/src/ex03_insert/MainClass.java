package ex03_insert;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {
	
	// INSERT의 리턴값은 int 값이다.(즉 숫자)
	// 삽입이 되면 1을 반환!  삽입이 안되었으면 0을 반환!
	// ps.executeUpdate(); 는 DML을 실행할때 사용한다 !!(필수)!!

	// 상수 삽입
	public static void ex01() {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			
			con = DriverManager.getConnection(url, p);
			// con.setAutoCommit(false);	수동으로 commit하려면 왼쪽에 있는 코드를 활용하면됌!
			
			String sql ="INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += " VALUES(MEMBER_SEQ.NEXTVAL, 'admin', '관리자', '서울', TO_DATE('2023-02-15', 'YYYY-MM-DD'))";
			
			ps = con.prepareStatement(sql);
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	// 변수 삽입
	public static void ex02() {
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "INSERT INTO MEMBER_TBL(MEMBER_NO, ID, NAME, ADDRESS, JOIN_DATE)";
			sql += " VALUES(MEMBER_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			
			String id = "master";
			String name = "운영자";
			String address = "경기";
			
			ps.setString(1, id);		// 1번째 물음표(?) 자리에 id를 넣으시오.
			ps.setString(2, name);		// 2번째 물음표(?) 자리에 name을 넣으시오.
			ps.setString(3, address);	// 3번째 물음표(?) 자리에 address을 넣으시오.
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	}
	
	
	
	
	
	public static void ex03() {
		
		// admin이 작성한 임의의 게시글 삽입해 보자
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			Properties p = new Properties();
			p.load(new BufferedReader(new FileReader("db.properties")));
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(url, p);
			
			String sql = "INSERT INTO BOARD_TBL(BOARD_NO, MEMBER_NO, TITLE, CONTENT, CREATE_DATE)"; 
			sql += " VALUES(BOARD_SEQ.NEXTVAL, ?, ?, ?, SYSDATE)";
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 1;
			String title = "오늘은 목요일";
			String content = "보충은 취소되었소";
			
			ps.setInt(1, memberNo);
			ps.setString(2, title);
			ps.setString(3, content);
			
			int insResult = ps.executeUpdate();
			
			System.out.println(insResult + "개의 행이 삽입되었습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(con != null) con.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		ex03();
		

	}

}
