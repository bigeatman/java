package dev.java.practice.ch02;

public class FromIntToDouble {
	public FromIntToDouble() {
		int num1 = 123456780;
		int num2 = 123456780;

		double num3 = num2;
		num2 = (int) num3;

		System.out.println(num1 - num2);
	}
}
