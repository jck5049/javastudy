package ex03_throw;

import java.util.Scanner;

public class MainClass {

	
	public static void ex01() {
		
		try {
			
			Integer.parseInt("하하");	// NumberFormatException 숫자 형식 오류
			int a = 4/ 0;				// ArithmeticException 연산이 잘못됬다는 오류
			System.out.println(a);
			
		}catch(Exception e) {
			System.out.println(e.getClass().getName());		// 예외 클래스 이름 확인
			System.out.println(e.getMessage());				// 예외 메세지 확인
		}
		
		
	}
	
	
	public static void ex02() {

		
		try {
			Integer.parseInt("호홓");
			
		} catch(Exception e) {

			e.printStackTrace(); 		// Stack 저장소 이름,  Trace 추적하다, 즉, 예외를 추적하는 메소드(개발중에는 이것만 사용함)
		}
		
		
	}
	
	
	public static void ex03() {
		
		/*
		 	throw
		 	1. 예외 객체를 생성해서 직접 던질 수 있다.
		 	2. 개발자가 직접 예외를 처리할 때 사용한다.
		 	3. 예외 처리를 할 때 (RuntimeException)을 사용한다.
		 */
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요 >>> ");
			int age = sc.nextInt();
			if(age < 0 || age > 100) {
				throw new RuntimeException(age + "살은 불가능합니다.");
			}
				
			System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ex03();

	}

}
