package ex04_override;

/*
	 
	 	메소드 오버라이드
	 	1. method override
	 	2. 부모 클래스의 메소드와 동일한 메소드 형식으로 자식 클래스가 새로운 메소드를 만드는 것이다.
	 	3. 부모 클래스의 메소드를 사용할 수 없기 때문에, 새로운 메소드를 다시 만드는 것이다.
	 	4. 자식 클래스가 메소드를 다시 만들 때는 애너테이션(Annotation) 중 @Override를 추가한다.
	 	
	 	
	 	메소드 오버로딩과 메소드 오버라이드의 차이점

	 	1. 하나의 클래스에 여러가지 메소드가 들어가 있으면 오버로딩
	 	2. 부모가 가진걸 자식이 가지겠다고 하면 오버라이드
	 	
	 	메소드 오버로딩과 메소드 오버라이드의 공통점
	 	1. 같은 기능이면 같은 이름을 써라.??
	 	
 */

public class Americano extends Espresso {

	@Override
	public void taste() {
		System.out.println("아메리카노는 맛있다.");
	}
	
	
	

}
