package ex02_Runnable;

public class Soldier implements Runnable{

	private String name;
	private Gun gun;
	
	public Soldier(String name, Gun gun) {		// new Soldier("김상사", new Gun(10))
		this.name = name;
		this.gun = gun;
	}
	
	public void shoot() {		// [김상사] 빵! 9발 남았습니다.
		System.out.print("[" + name + "] ");
		gun.shoot();
	}
	
	@Override
	public void run() {
		
		// 1초에 1발씩 쏘기
		// 1초동안 일시중지 시키기 : Thread.sleep(1000);  1000밀리초(1초) 일시중지 -> 반드시 예외처리가 필요하다.
		
		try {
			
			while(gun.getBullet() != 0) {
				shoot();
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
