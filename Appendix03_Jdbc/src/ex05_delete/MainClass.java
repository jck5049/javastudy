package ex05_delete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MainClass {

	
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
			
			
			// 회원번호가 1인 회원을 삭제하시오.
			String sql ="DELETE FROM MEMBER_TBL WHERE MEMBER_NO = ?";
			
			ps = con.prepareStatement(sql);
			
			int memberNo = 1;
			
			ps.setInt(1, memberNo);
			
			int delResult = ps.executeUpdate();
			
			System.out.println(delResult + "개의 행이 삭제되었습니다.");
			
			
			
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
		
		ex01();
		
	}

}
