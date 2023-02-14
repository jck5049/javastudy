package ex02_Runnable;

// Soldier를 스레드 처리하는 이유
// new Soldier()를 이용해서 객체를 생성할 때마다 해당 객체는 독립적으로 동작한다.

/*
	Runnable 인터페이스를 구현하는 방법
	1. implements Runnable 처리한다.
	2. Runnable 인터페이스의 public abstract void run(); 추상메소드를 오버라이드 한다.
	3. Runnable 객체를 만들고, Runnable 객체를 이용해서 Thread 객체를 만든다.
	4. Thread 객체가 가진 run 메소드는 start 메소드로 호출한다.
*/

public class Gun {


	private int bullet;
	
	public Gun(int bullet) {
		this.bullet = bullet;
	}
	
	public void shoot() {
		if(bullet == 0) {
			throw new RuntimeException("총알이 없습니다.");
		}
		bullet--;
		System.out.println("빵! " + bullet + "발 남았습니다.");
	}
	
	public int getBullet() {
		return bullet;
	}
	
	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
}
