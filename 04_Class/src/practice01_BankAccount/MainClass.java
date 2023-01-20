package practice01_BankAccount;

public class MainClass {

	public static void main(String[] args) {

		BankAccount myAcc = new BankAccount("010-5049-6563", 50_000); 
		BankAccount yourAcc = new BankAccount("010-1234-5678", 100_000);
		
		
		myAcc.transfer(yourAcc, 30_000);
		
		
		
		
		
		
		
		// 조회
		
		myAcc.inquiry();
		yourAcc.inquiry();
		
		
		
		
		
		
		
		
	}

}
