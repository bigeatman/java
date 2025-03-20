package dev.java.practice.ch12;

public class MainThreadExample {
	public MainThreadExample() {
		Calculator calc = new Calculator();

		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();
	}
}
