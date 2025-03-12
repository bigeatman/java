package dev.java.practice.ch2;

public class CastingExample {
	public CastingExample() {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
