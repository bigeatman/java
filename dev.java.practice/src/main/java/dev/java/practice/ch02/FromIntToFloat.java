package dev.java.practice.ch02;

public class FromIntToFloat {
	public FromIntToFloat() {
		int num1 = 123456780;
		int num2 = 123456780;

		float num3 = num2;
		num2 = (int) num3;

		int result = num1 - num2;
		System.out.println(result);
	}
}
