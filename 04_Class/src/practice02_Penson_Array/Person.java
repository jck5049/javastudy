package practice02_Penson_Array;

public class Person {

	// 필드

	
	private String name;
	private int age;
	
	// 생성자  (디폴트 생성자는 생성자 1개도 안 만들었을때 사용가능. 1개라도 만들면 디폴트 생성자는 사용불가.
	
	
	public Person () {}      // new Person() 이라고함.
	public Person (String name, int age) {       // new Person("alice", 20)
		this.name = name;
		this.age = age;
	}
	
	
	// 메소드
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
}
