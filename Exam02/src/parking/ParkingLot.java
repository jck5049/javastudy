package parking;

import java.util.Scanner;

public class ParkingLot {

	private String name;
	private Car[] cars;
	private int idx;
	private Scanner sc;
	
	public ParkingLot(String name) {
		this.name = name;
		cars = new Car[10];
		sc = new Scanner(System.in);
	}
	
	public void addCar() {
		
		System.out.println("현재 등록된 차량 : " + idx + "대");
		if(idx == cars.length) {
			System.out.println("더 이상 차량 등록이 불가능합니다.");
			return;
		}
		System.out.println("차량번호 >>> ");
		String carNo = sc.next();
		
		System.out.println("모델 >>> ");
		String model = sc.next();
		
		cars[idx++] = new Car(carNo, model);
		
		System.out.println("차량번호 " + carNo + " 차량이 등록 되었습니다.");
	}
	
	/*
	 
	 
	4) public void deleteCar() { }

    (1) 주차장이 비어 있는 경우 "등록된 차량이 없습니다." 메시지를 출력하고 deleteCar() 메소드를 종료한다.

    (2) sc 인스턴스를 이용해서 제거할 차량번호를 입력 받은 뒤 해당 차량번호와 일치하는 정보를 삭제한다.

    (3) 차량번호가 "288러1111"인 차량을 삭제한 경우 "차량번호 288러1111 차량이 삭제되었습니다." 메시지를 출력한다.

    (4) 입력된 차량번호와 일치하는 정보가 없는 경우 "대상 차량이 존재하지 않습니다." 메시지를 출력한다.
	
	*/
	
	public void deleteCar() {
		
		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		System.out.println("제거할 차량번호 >>> ");
		String carNo = sc.next();
		
		for(int i = 0; i < idx; i++) {
			Car car = cars[i];
			if(carNo.equals(car.getCarNo())) {
				
				// 방법 1. 삭제할 요소의 뒤에 있는 것들을 모두 한 칸씩 앞으로 옮기기(당기기)
				
				System.arraycopy(cars, i + 1, cars, i, idx - i - 1);
				cars[--idx] = null;
				System.out.println("차량번호 " + carNo + "인 차량이 삭제되었습니다.");
				return;
				/*
				 
				방법 2. 마지막 차량을 옮겨오기
				
				마지막 차량을 옮겨오기
				제거할 차량의 위치 : i
				마지막 차량의 위치 : idx - 1
				cars[i] = cars[idx - 1];
				cars[--idx] = null;
				return;
				*/
			}
		}
			System.err.println("대상 차량이 존재하지 않습니다.");
		
		
		
	}
	
	public void printAllCars() {
		
		if(idx == 0) {
			System.out.println("등록된 차량이 없습니다.");
			return;
		}
		System.out.println(name + "차량 목록");
		for(int i = 0; i < idx; i++) {
			Car car = cars[i];
			System.out.println(car);
		}
		/*
		 
		for(int i = 0; i < cars.length; i++) {
			Car car = cars[i];
			if(car != null) {
			System.out.println(car);
		}
		
	}
	
		for(Car car : cars) {
		if(car != null) {
		System.out.println(car);
		}
	
	]
		 */
		
	}
	
	
	
	public void manage() {
		
		while(true) {
			
			System.out.print("1.추가	2.삭제	3.전체	0.종료 >>> ");
			
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				addCar();		// addCar 호출
				break;
			case "2":
				deleteCar();	// deleteCar 호출
				break;
			case "3":
				printAllCars();	// printAllCars 호출
				break;
			case "0":
				return; 	// manage 메소드 종료
			default:
				System.out.println("존재하지 않는 메뉴입니다.");
			}
			
		}
		
	}
	
	
	
	
	
}
