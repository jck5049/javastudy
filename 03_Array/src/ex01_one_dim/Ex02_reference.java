package ex01_one_dim;


public class Ex02_reference {

	// 16진수(참조) >>  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a(10), b(11), c(12), d(13), e(14), f(15), 10(16)
	// 0x10 >> 16
	
	
	public static void ex01() {
		
		int[] arr;      // reference = address (위치, 주소값)
		
		arr = new int[5];
		
		System.out.println(arr);  // 5개 배열 요소의 참조(주소, 번지) 값.
		
	}
	
	
	public static void ex02() {
		
		int[] a = new int[5];
		int[] b;
		
		b = a;
		
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		b[0] = 100;
		System.out.println(a[0]);
		
	}
	
	/*
    	|-------|
  		a | 0x123 |─────┐
    	|-------|          │
    	|  ...  |          │
    	|-------|          │
   a[0] |   0   | 0x123    │
    	|-------|          │
   a[1] |   0   |          │
    	|-------|          │
   a[2] |   0   |          │ b = a;
    	|-------|          │
   a[3] |   0   |          │
    	|-------|          │
   a[4] |   0   |          │
    	|-------|          │
    	|  ...  |          │
    	|-------|          │
      b | 0x123 |◀────┘
    	|-------|
	*/
	
	
	public static void ex03() {    // 심화
		
		// 생성된 배열의 크기를 늘이는 방법
		
		// 기존 배열
		int[] a = new int [5];
		
		// 신규 배열
		int[] b = new int [10];
		
		// 기존 배열 요소 -> 신규 배열 요소
		for(int i = 0; i < a.length; i++) {
			b[i] = a[i];
			
		}
		
		// 기존 배열의 참조값을 신규 배열의 참조값으로 수정
		a = b;
		
		// 기존 배열이 신규 배열로 변경되었으므로 확인
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		ex02();
		
	
	}
	
}
