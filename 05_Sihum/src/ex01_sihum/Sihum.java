package ex01_sihum;

public class Sihum {

	
	// 문제1. int serial의 
	//첫 번째 글자가 1,3,5이면 "남자",
	//2,4,6이면 "여자"를 출력하시오.
	// int serial의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
	// 예시
	// 남자입니다.
	
	
	public static void ex01() {
	      
			int serial = 225;
			
			while(serial >= 10) {
				serial /= 10; 
			} 
			
			
			if (serial == 1 || serial == 3 || serial == 5 ) {
				System.out.println("남자");
				
			} else if (serial == 2 || serial == 4 || serial == 6 ) {
				System.out.println("여자");
			}
			
			
			/*
			 * while(serial < 7) { serial /= 10; } if(serial % 2 == 0) {
			 * System.out.println("여자입니다."); }else System.out.println("남자입니다.");
			 */
	      
	   }
	
	
	
	
	public static void ex02() {
		
		
		
		
		
	}
	
	
	
	
	
	// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
	// 예시
	// 2 x 1 = 2
	// 2 x 2 = 4
	// ...
	// 5 x 5 = 25
	
	public static void ex03() { 
		
		for(int dan = 2; dan <= 5; dan++) { 
			if(dan == 5) {
	            for(int n = 1; n <= 5; n++) {
	               System.out.println(dan + "x" + n + " = " + (dan * n));
	            }   
	         } else {
	             for(int n = 1; n <= 9; n++) { 
	                 System.out.println(dan + "x" + n + " = " + (dan * n)); //2 x 1 = 2
	              }
	           }
       
      }
	}
	//옹이코드
	
	public static void ex03_옹() {   
		
		for(int dan = 2; dan <= 5; dan++) {  
             for(int n = 1; n <= 9; n++) { 
                 System.out.println(dan + "x" + n + " = " + (dan * n)); //2 x 1 = 2
	             if (dan==5 && n == 5) {
	            	 break;
	             }
             }
      }
	}
	
	

	
	
	
	
	public static void ex04() {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	// 문제5. 1부터 100 사이의 모든 짝수와 홀수를 각각 더한 결과를 모두 출력하시오.
	// 예시
	// 짝수 합은 2550입니다.
	// 홀수 합은 2500입니다.
	
	
	public static void ex05() {
		
		int a = 0;
		int b = 0;
		
		for(int n = 1; n <= 100; n++) {
				if(n % 2 == 0) {
				a += n;
			}	else if(n % 2 == 1) {
				b += n;
			}
			
		}
		System.out.println("짝수 합은 " + a + "입니다.");
		System.out.println("홀수 합은 " + b + "입니다.");
		
	}
	
	
	
	
	
	public static void ex06() {
	      
		
		
		
		
	   }
	
	
	
	
	public static void ex07() {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void ex08 () {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void ex09() {
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void ex10() {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ex05();

	}

}
