package dev.java.practice.ch4;

public class ForSumFrom1To100Example {
	public ForSumFrom1To100Example() {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println("1~100 합 : " + sum);
	}
}
