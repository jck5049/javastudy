package ex02_loop;

public class Ex01_for {

	/*
	    for문
	    1. 연속된 숫자를 생성하는 반복문 (배열에서 주로 사용)
	    2. 형식
	    	for(초기문;(변수까지 들어간다 변수 선언후 값을 적용) 조건문; 증감문) {
	    		실행문
	    	}
	 */
	
	public static void ex01() {
		
		// 1 ~ 10  
		// 초기문 1번,  조건문 2번 ,  실행문 3번 ,  그다음 증감문 4번 순으로 작동이 된다!
		// 그리고 (2, 3, 4번 순으로 반복된다.)
		
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
			
		}
		
		
	}
	
	
	
	public static void ex02 () {
		
		// 횟수
		// 대부분 개발자들은 초기문 시작은 0으로 시작한다. (조건문으로만 조정하여 대부분 개발한다.)
		
		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
		
		
	}
	
	
	public static void ex03 () {
		
		// 10 ~ 1 까지 나란히 나오게하는 연습문제
		
		for (int a = 10; a >= 1; a-- ) {
			System.out.println(a);
		}
		
		
	}
	
	
	public static void ex04 () { 
		
		// 구구단 2단 출력  연습문제
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		
		int dan = 2; // 이 곳에 원하는 구구단을 넣으면 된다. 변수를 활용해 아래 실행문으로 코드를 작성하는게 좋다.
		
		for (int a = 1; a <= 9; a++) {
			System.out.println(dan + " x " + a + " = " + (dan * a));
			
		}
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		// 
		
		ex04();
		
		
		

	}

}
