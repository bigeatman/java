package dev.java.practice.ch3;

public class InputDataCheckNaNExample {
	public InputDataCheckNaNExample() {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);

		double currentBalance = 10000.0;

		currentBalance += val;
		System.out.println(currentBalance);
	}
}
