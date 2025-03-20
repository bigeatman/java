package dev.java.practice.ch12;

public class User2 extends Thread {

	private Calculator calc;

	public void setCalculator(Calculator calc) {
		this.setName("User2");
		this.calc = calc;
	}

	@Override
	public void run() {
		calc.setMemory(50);
	}
}
