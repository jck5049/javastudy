package ex04_builder;

import ex04_builder.User.Builder;

public class MainClass {

	public static void main(String[] args) {

		Builder builer = User.builder();
		
		User user = User.builder()
						.id("admin")
						.pw("123456")
						.Build();
		
		System.out.println(user);

	}

}
