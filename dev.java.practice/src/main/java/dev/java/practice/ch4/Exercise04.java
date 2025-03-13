package dev.java.practice.ch4;

public class Exercise04 {
	public Exercise04() {
		while (true) {
			int num1 = (int) (Math.random() * 10 % 6 + 1);
			int num2 = (int) (Math.random() * 10 % 6 + 1);

			System.out.println(num1 + ", " + num2 + " sum : " + (num1 + num2));

			if (num1 + num2 == 5) {
				break;
			}
		}
	}
}
