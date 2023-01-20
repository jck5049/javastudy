package ex02_random;

import java.security.SecureRandom;

public class Ex03_SecureRandom {

	
	
	
	
	
	public static void main(String[] args) {
		
		// java.security.SecureRandom  보안이 되는 랜덤이다.
		// 1. 보안이 필요한 경우에는 SecureRandom을 사용하자.
		
		SecureRandom secureRandom = new SecureRandom();
		
		// 정수 난수
		int dice = secureRandom.nextInt(6) + 1;   // 주사위 1 ~ 6
		System.out.println(dice);
		
		
		
		
	}

}
