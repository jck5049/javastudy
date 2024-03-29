package ex01_branch;

public class Ex04_switch {

	/*
	 
		switch(표현식) {
		case 값1 : 실행문
		case 값2 : 실행문
		...
		default : 실행문 (if에 else 개념!)
		}
		
		표현식의 결과로 주로 사용하는 타입
		- int
		- String
		
		표현식의 결과로 사용 불가능한 타입
		- boolean
		- double
		- long
	 */
	
	
	//12월, 1월, 2월은 겨울입니다.
	//3월,4월,5월은 봄입니다.
	//6월 7월 8월은 여름입니다.
	//그 외엔 가을입니다.
	//6월의 계절을 출력하세요
	
	public static void ex01() {
		
		int month = 6;
		
		switch(month) {
		case 12:
		case 1:
		case 2: System.out.println("겨울"); break;
		case 3:
		case 4:
		case 5: System.out.println("봄"); break;
		case 6:
		case 7:
		case 8: System.out.println("여름"); break;
		default: System.out.println("가을"); 
		}
		
	}
	
	
	public static void ex02() {
		
		int day = 13;
		
		String weekName;
		
		switch(day % 7) {
		case 0: weekName = "토"; break;
		case 1: weekName = "일"; break;
		case 2: weekName = "월"; break;
		case 3: weekName = "화"; break;
		case 4: weekName = "수"; break;
		case 5: weekName = "목"; break;
		default: weekName = "금";
		}
		
		System.out.println(day + "일은" + weekName + "요일이다.");
		
		
	}
	
	
	
	
	public static void ex03() {
		
		// 수, 우, 미, 양, 가, 잘못된 점수
		
		int score = 100;
		
		if(score < 0 | score > 100) {
			System.out.println("잘못된 점수");
			return; // ex03 메소드를 종료하시오.
			
			// return >> 메소드에 반환타입이 void가 아닐경우 return 이라는 코드를 마지막에 작성하기! 필수조건.
			
		}
		
		switch(score / 10) {
		case 10:
		case 9: System.out.println("수"); break;
		case 8: System.out.println("우"); break;
		case 7: System.out.println("미"); break;
		case 6: System.out.println("양"); break;
		default: System.out.println("가");
		
		}
		
		
		
		
	}
	
	public static void ex04() {
		
		// 1분기(1~3), 2분기(4~6), 3분기(7~9), 4분기(10~12)
		
		int month = 8;
		
		switch(month) {
		case 1: case 2: case 3:
			System.out.println("1분기");
			break;
		case 4: case 5: case 6:
			System.out.println("2분기");
			break;
		case 7: case 8: case 9:
			System.out.println("3분기");
			break;
		default:
			System.out.println("4분기");
		}
		
	}
	
	
	// ex04 와 같은 문제이지만 다른 방법으로 풀이한 코드!!
	// ex04 와 같은 문제이지만 다른 방법으로 풀이한 코드!!
	// ex04 와 같은 문제이지만 다른 방법으로 풀이한 코드!!
	
	public static void ex05() {
		
		
		int month = 6;
		
		System.out.println((month - 1) / 3 + 1 + "분기");
		
		switch((month - 1) / 3) {
		case 0:
			System.out.println("1분기");
			
			break;
		case 1:
			System.out.println("2분기");
			break;
		case 2:
			System.out.println("3분기");
			break;
		default:
			System.out.println("4분기");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ex03();
		
	}

}
