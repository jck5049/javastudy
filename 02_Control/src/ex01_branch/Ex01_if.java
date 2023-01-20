package ex01_branch;

public class Ex01_if {

	
	public static void ex01() {
		
		
		//점수가 60점 이상이면 합격이고, 60점 미만이면 불합격입니다.
		//철수는 수학점수가 50점입니다.
		//합격 불합격 여부를 출력하세요
		
		// if 문
		
		int 수학점수 = 50;
		
		if(수학점수 >= 60) {
			System.out.println("합격");
		}
		else if(수학점수 < 60) {
			System.out.println("불합격");
		}
	
	}
	
	/*
	
	if(조건) {
		
	} else if(조건) {
		
	} else if(조건){
		
	} else {
		
	}
	
	*/
	
	
	public static void ex02() {
		
		// if 문의 중괄호
		// 실행문이 1개인 경우 생략할 수 있다.
		// 실행문이 2개 이상인 경우 반드시 필요하다.
		
		//철수의 점수는 80점입니다.
		//점수가 60점 이상이면 합격 축하합니다를 출력하고,
		//점수가 60점 미만이면 불합격 보충수업입니다를 출력하세요
		
		int a = 80;
		
		if(a >= 60) {
			System.out.println("합격 축하합니다.");
		}
		else if(a < 60) {
			System.out.println("불합격 보충수업입니다.");
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ex02();
		
		

	}

}
