package dev.java.practice.ch04;

public class WhileSumFrom1To100Example {
	public WhileSumFrom1To100Example() {
		int sum = 0;

		int i = 1;

		while (i <= 100) {
			sum += i;
			i++;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum);
	}
}
