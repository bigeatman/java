package dev.java.practice.ch12;

public class User1 extends Thread {

	private Calculator calc;

	public void setCalculator(Calculator calc) {
		this.setName("User1");
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory(100);
	}
}
