package ex01_sihum;

public class SuddenAttack {
	
	int weight; //무게
	String name; //이름
	
	//생성자
	public SuddenAttack(int weight) {
		this.weight = weight;
	}
	//생성자
	public SuddenAttack(String name) {
		this.name=name;
	}
	
	
	
	void touch(){
		System.out.println("종찬님을 touch 했어요");
	}
	void kill() {
		System.out.println("종찬님을 kill 했어요");
	}
	int eat() {
		System.out.println("아이템을 먹었어요");
		weight++;
		return weight;
	}

}
