package ex04_op_number;

public class MainClass {

	// ex01 메소드 정의 (메소드를 하나 만들다. 즉 기능을 만들다. 만드는 위치는 위에든 아래든 아무곳이나 상관없다. 순서도 상관 X)
	
	public static void ex01() {
		
		int a = 5;
		int b = 2;
		
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b; // 몫을 계산한 것.
		int mod = a % b; // 나머지를 계산한 것. % << 나머지 계산법.
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
	}
	
	// ex02 메소드 정의 (연습)
	
	public static void ex02() {
		
		int a = 5;
		int b = 2;
		
		double div = (double)a / b;
		
		// 타입을 한개만 바꿔줘도 남은 타입도 동일 타입으로 변경된다!
		// 궁금한부분 기존타입보다 작은 타입으로 변경시에는 한쪽도 변경이 가능한가???
		
		System.out.println(div);  // 2.5
		
	}
	
	
	// ex03 메소드 정의 (연습)
	
	public static void ex03() {
		
		
		int second = 90;
		
		int min = second / 60;  // 1분
		int sec = second % 60;  // 30초
		
		System.out.println(min);
		System.out.println(sec);
		
	}
	
	
	// ex04 메소드 정의
	public static void ex04() {
		
		// 1 증감 : ++
		// 1 감소 : --
		
		// 전위 연산(pre operator)
		// ++a 또는 --a	
		// 변수 a의 값을 1 증가(감소)시킨 뒤에 사용하시오.
		
		int a = 10;
		System.out.println(++a);
		System.out.println(a);
		
		// 후위 연산(post operator)
		// b++ 또는 b--
		// 변수 b의 값을 사용한 뒤에 1 증가(감소)시키시오.
		
		int b = 10;
		System.out.println(b++);
		System.out.println(b);
		
		
	}
	
	// ex05 메소드 정의
	public static void ex05() {
		
		// 대입 연산
		// 등호 (=)의 오른쪽 값을 왼쪽으로 보내는 연산
		
		
		int a;
		a = 10;
		System.out.println(a);
		
		
	}
	
	
	// ex06 메소드 정의 (연습)
	public static void ex06() {
		
		int x = 10;
		int y = 20;
		
		// 교환 temp << 라는 코드를 사용하여 기존 아무 변수값을 저장해두고 다시 백업하면 된다.
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		
		System.out.println(x);
		System.out.println(y);
		
		
		
	}
	
	
	// ex07 메소드 정의
	public static void ex07() {
		
		int account = 10000;
		
		account += 5000;     // account = account + 5000;
		System.out.println(account);
		
		account -= 50000;    // account = account - 50000;
		System.out.println(account);
		
		
		
	}
	
	// ex08 메소드 정의 (연습)
	
	public static void ex08() {
		
		long account = 123456;
		
		// 5% 이자 받으면 얼마?
		// 결과를 저장할 double 데이터가 있어야 한다.
		
		double result;
		result = account * 1.05;    //  result = account + account * 0.05;
		
		System.out.println(result);
		
	}
	
	
	
	
	
	// 아래 수식이 메인 메소드임.
	// 아래 수식이 메인 메소드임.
	// 아래 수식이 메인 메소드임.
	
	
	public static void main(String[] args) {
		
		ex08();  // ex08 메소드 호출 (main 메소드를 제외한 만든 메소드는 호출을 해야 실행이 가능하다!)
		
		
	}

}
