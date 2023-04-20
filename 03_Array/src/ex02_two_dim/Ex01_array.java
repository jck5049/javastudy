package ex02_two_dim;

public class Ex01_array {

	
	
	public static void ex01() {
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성
		arr = new int[3][2];   // 3행 2열 (길이가 2인 배열 3개가 있다.)라고 해석하기! "뒤에 길이 앞에 갯수"		
		
		// 2차원 배열 순회  row major "행으로 순회" (앞열부터 왼쪽에서 오른쪽으로 진행후 뒷열로 이동) 이 방법을 사용함!
		// 					column major "열로 순회" (1열 앞에서부터 뒤로 진행후 2열로 넘어와서 다시 앞에서 뒤로 순회) 
		
		for(int i = 0; i < 3; i++) {  // i : 행 번호
			for(int j = 0; j < 2; j++) {    // j : 열 번호
				
				System.out.print(arr[i][j] + "\t");
				
			}
			System.out.println();
			
		}
		
		
		
	}
	
	
	
	public static void ex02() {
		
		// 2차원 배열 선언 + 생성
		int[][] arr = new int [3][2];
		
		// 길이 확인
		System.out.println(arr.length); // 3행이다. (1차원 배열이 3개있다.)
		System.out.println(arr[0].length);  // 1번째 1차원 배열의 길이
		System.out.println(arr[1].length);  // 2번째 1차원 배열의 길이
		System.out.println(arr[2].length);  // 3번째 1차원 배열의 길이
		
		// 2차원 배열 순회
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
	
	public static void ex03() {
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성(행만 생성하기)
		arr = new int[3][];
		
		// 각 행이 가질 열을 생성하기( 각 1차원 배열의 생성이 된다.)
		arr[0] = new int[5];
		arr[1] = new int[3];
		arr[2] = new int[2];
		
		// 2차원 배열 순회
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
	public static void ex04() {
		
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		ex04();
		
		
		// 

		
		
		
		
		
		
	}

}
