package ex02_loop;

public class Ex05_nested_loop {

	
	public static void ex01() {
		
		for(int day = 1; day <= 5; day++) {
			for(int hour = 1; hour <= 8; hour++) {
				System.out.println(day + "일차 " + hour + "교시 수업");
		
			}
		}
	}
	
	public static void ex02() {   // 연습문제 1
		
		
		int day = 1;
		while(day <= 5) {
			
			int hour = 1;
			while(hour <= 8) {
				System.out.println(day + "일차 " + hour + "교시 수업");
				hour++;
			}
			day++;
		}
			
		
	}
	
	public static void ex03() {  // 연습문제 2
		
		// 전체 구구단 출력하기
		// 2 x 1 = 2
		// ....
		// 9 x 9 = 81
		
		
		for (int dan = 2; dan <= 9; dan++) {
			for(int n = 1; n <= 9; n++)
			System.out.println(dan + " x " + n + " = " + (dan * n));
		}
		
		
	}
	
	
	public static void ex04() {  // 연습문제 3
		
		// 전체 구구단 출력하기
		
		//선생님문제
		// 2x1=2  3x1=3  4x1=4 	.... 9x1=9
		// ...
		// 2x9=18 3x9=27 4x9=36 .... 9x9=81
		
		//디옹이문제
		// 2x1=2  2x2=4  2x3=6  2x4=8 ... 2x9=18
		//...
		// 9x1=9  9x2=18  9x3=27 9x4=36 ... 9x9=81
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + "\t");
				
			}
			System.out.println();
	}
		
		

		
}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ex04();
		

	}

}
