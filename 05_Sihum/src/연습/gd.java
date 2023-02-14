package 연습;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class gd {

	public static void ex01 () {
		String[] friends = {"정우성","송강","차은우"};
		String name = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 >>>");
		name = sc.next();
		
		for(int i = 0; i < friends.length; i++) {
				if(friends[i].equals(name)) {
					System.out.println("반갑다 친구야");
					break;
				} else {
					System.out.println("처음 뵙겠습니다.");
					break;
				}
		}
		sc.close();
		
	
		
		
		
	}
	
	public static void ex02() {
		// 문제7. 구구단을 외자.
		   // 2~9단 사이의 임의의 구구단이 출력되면 정답을 입력한다.
		   // 정답을 입력해서 맞으면 "정답", 틀리면 "땡"을 출력하시오.
		   // 예시1)
		   // 4x9? >>> 36
		   // 정답
		   // 예시2)
		   // 8x7? >>> 49
		   // 땡
		   

		      /*
		         기본 값이 double이기 때문에 int로 변환해 주는 작업이 필요하다.
		         난수 생성하기
		         
		       * 
		      //int dan
		         Math.random()                    0.0 <= n < 1.0
		         Math.random() * 3             0.0 <= n < 3.0
		         (int)(Math.random() * 3)       0 <= n < 3
		         (int)(Math.random() * 8) + 2    2 <= n < 10
		         ----------------------------------------------------
		         (int)(Math.random() * 개수 ) + 시작값
		         
		       * 
		      //int n
		         Math.random()                    0.0 <= n < 1.0
		         Math.random() * 3             0.0 <= n < 3.0
		         (int)(Math.random() * 9)       0 <= n < 9
		         (int)(Math.random() * 9) + 1    1 <= n < 10
		         ----------------------------------------------------
		         (int)(Math.random() * 개수 ) + 시작값
		         
		       */
		      
		      // Scanner 객체 생성
		      Scanner sc = new Scanner(System.in);
		      
		      // 위쪽 표를 보고 dan ,과 n의 난수를 생성
		      int dan = (int)(Math.random()*8) + 2;
		      int n = (int)(Math.random()*9) + 1;
		      
		      // int 입력
		      System.out.println(dan + "x" + n +" ? = >>> ");
		      int answer = sc.nextInt();
		      
		      // 삼항 연산
		      // dan * n과 answer의 값이 같으면 정답 , 아니면 땡
		      System.out.println(dan * n == answer ? "정답" : "땡");
		      
		      // Scanner 객체 종료
		      sc.close();
		
		
		
	}
	
	
	
	public static void ex03() {
		// 문제10. Scanner 클래스의 next() 메소드를 이용해서 사람 이름을 입력 받은 뒤
	      // 친구의 이름이면 "반갑다 친구야"를 출력하고, 모르는 사람의 이름이면 "처음 뵙겠습니다"를 출력하시오.
	      // 친구의 이름을 String[] friend 배열에 저장한 뒤 작업을 수행하시오.
	      // 예시1
	      // 이름 입력 >>> 정우성
	      // 반갑다 친구야
	      // 예시2
	      // 이름 입력 >>> 유재석
	      // 처음 뵙겠습니다
	      
	         
	         String[] friends = {"정우성","송강","차은우"};
	         String name = "";
	         
	         Scanner sc = new Scanner(System.in);
	         System.out.println("이름 입력 >>>");
	         name = sc.next();
	         if(friends[0].equals(name) || name.equals(friends[1])) {
	            System.out.println("반갑다 친구야");
	         } else {
	            System.out.println("처음 뵙겠습니다.");
	         }
	         sc.close();
	         
	      }
		
		
		
		
		
	
	
	
	public static void ex04() {
		
		/*
		   문제8. installer의 CodingFonts.zip 파일을 
		   		 storage폴더로 Fonts.zip으로 복사하시오.
		 */
		
			
			File from = new File("/Users/woomin/Documents/GDJ61/installer", "CodingFonts.zip");
			File to = new File("/Users/woomin/Documents/storage", "Fonts2.zip");
			
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			
			try {
				bis = new BufferedInputStream(new FileInputStream(from));
				bos = new BufferedOutputStream(new FileOutputStream(to));
				byte[] b = new byte[1024]; // 1키로바이트씩 이동
				
				int readByte = 0;
				
				while((readByte = bis.read(b)) != -1) {
					bos.write(b, 0, readByte);
				}
				
				System.out.println("복사");
				
				
			}catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					if(bos != null && bis != null) {
						bis.close();
						bos.close();
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
					
		}
		
		
		
		
	
	
	
	
	public static void ex05() {
		
		
		// 문제3. 자동으로 진행되는 윷 던지기를 구현하시오. 윷이나 모가 나오면 추가로 던지시오.
		// 예시)
		// "도", 1칸 이동한다.
		// "개", 2칸 이동한다.
		// "걸", 3칸 이동한다.
		// "윷", "도", 5칸 이동한다.
		// "모", "윷", "도", 10칸 이동한다.
		
			boolean run = true;
			String[] yut = {"", "도", "개", "걸", "윷", "모"};
			int move = 0;
			while(true) {
				int num = (int)(Math.random() * 5 + 1);
				switch(num) {
				case 1: case 2: case 3:
					move += num;
					System.out.println("\"" + yut[num] + "\", " + move + "칸 이동한다.");
					return;
				case 4: case 5:
					move += num;
					System.out.print("\"" + yut[num] + "\", ");
					break;
				}
			}
		}
		
		
		
	public static void ex06() {
		
		var str = "이체할 금액 300원 , 이체한 금액 300원" ;
		System.out.println(str.indexOf("3"));
		System.out.println(str.indexOf("3", 10));
		System.out.println(str.lastIndexOf("3"));
		System.out.println(str.lastIndexOf("3", 10));
		System.out.println(str.indexOf("5"));
	}
		
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ex06();
		
		
		
	}
	
}
