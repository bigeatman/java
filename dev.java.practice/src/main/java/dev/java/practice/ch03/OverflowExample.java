package dev.java.practice.ch03;

public class OverflowExample {
	public OverflowExample() {
		long x = 1000000;
		long y = 1000000;
		long z = x * y;

		System.out.println(z);
	}
}
