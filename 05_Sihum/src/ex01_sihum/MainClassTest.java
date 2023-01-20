package ex01_sihum;

public class MainClassTest {

	public static void main(String[] args) {
		
		SuddenAttack sudden  = new SuddenAttack(100);
		
		SuddenAttack sudden2 = new SuddenAttack("종찬");
		/*
		 * int jonggiWeight =0;
		 * 
		 * sudden.touch(); jonggiWeight = sudden.eat();
		 * System.out.println(jonggiWeight); sudden.kill();
		 */
		
		System.out.println(sudden.weight);
		System.out.println(sudden2.name);
		
		
	}

}
