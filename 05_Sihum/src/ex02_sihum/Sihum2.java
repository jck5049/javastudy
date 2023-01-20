package ex02_sihum;

import java.util.Arrays;


public class Sihum2 {


		// 문제1. 절대값 구하기
		public static void ex01() {
			int number = 5;
			
		}
		
		// 문제2. 나이에 따른 구분하기
		// 0 ~ 7    : 미취학아동
		// 8 ~ 13   : 초등학생
		// 14 ~ 16  : 중학생
		// 17 ~ 19  : 고등학생
		// 20 ~ 100 : 성인
		// 나머지   : 잘못된 나이
		public static void ex02() {
			String strAge = "30";
			
		}
		
		// 문제3. 삼각형 넓이 구하기
		public static void ex03() {
			int width = 3;
			int height = 3;
			
		}
		
		// 문제4. 월 -> 계절과 마지막 일 출력하기
		public static void ex04() {
			/*
				month % 12 / 3
				겨울 : 0
				봄   : 1
				여름 : 2
				가을 : 3
			*/
			int month = 13;
			String[] season = {"겨울", "봄", "여름", "가을"};
			int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
		}
		
		// 문제5. 10과 가까운 수 찾기
		public static void ex05() {
			int a = 8;
			int b = 11;
			
		}
		
		// 문제6. money 분리하기
		public static void ex06() {
			
			int money = 87654;
			int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
			int[] count = new int[unit.length];
			
			
			
		}
		
		// 문제7. 2차원 배열에 구구단 결과 저장하기
		/*
		  2  4  6  8 10 12 14 16 18
		  3  6  9 12 15 18 21 24 27
		  4  8 12 16 20 24 28 32 36
		  5 10 15 20 25 30 35 40 45
		  6 12 18 24 30 36 42 48 54
		  7 14 21 28 35 42 49 56 63
		  8 16 24 32 40 48 56 64 72
		  9 18 27 36 45 54 63 72 81
		*/
		public static void ex07() {
			
			int[][] arr = new int[8][9];
			
			
			
			
			
		}
		
		// 문제8. int score에 해당하는 학점을 출력하시오. switch문을 활용하시오.
		// 100    : S
		//  99~97 : A+
		//  96~94 : A0
		//  93~90 : A-
		//  89~87 : B+
		//  86~84 : B0
		//  83~80 : B-
		//  79~77 : C+
		//  76~74 : C0
		//  73~70 : C-
		//  69~0  : F
		// 예시)
		// 점수 98점은 학점 A+입니다.
		public static void ex08() {
			int score = 98;
			char grade, point;
			// point
			
		}
		
		// 문제9. String height 정보를 이용해 워터파크에서 탑승이 가능한 모든 어트랙션을 출력하시오.
		//   1. 슬라이드 : 120 이상 탑승 가능
		//   2. 부메랑고 : 130 이상 탑승 가능
		//   3. 인피닛풀 : 140 이상 탑승 가능
		// 예시(키가 135.5인 경우)
		// 슬라이드 탑승 가능합니다.
		// 부메랑고 탑승 가능합니다.
		public static void ex09() {
			
			String height = "135.5";
			double tall = Double.parseDouble(height);
			
			
		}
		
		// 문제10. int second에 저장된 초를 시/분/초로 변환하여 출력하시오.
		// 1분이 넘는 경우 '분'까지 표시하고, 1시간이 넘는 경우 '시'까지 표시하시오.
		// 예시1)
		// 40초는 40초입니다.
		// 예시2)
		// 90초는 1분 30초입니다.
		// 예시3)
		// 3690초는 1시간 1분 30초입니다.
		public static void ex10() {
			int second = 3690;
		}
		
		public static void main(String[] args) {
			ex07();
		}
}
