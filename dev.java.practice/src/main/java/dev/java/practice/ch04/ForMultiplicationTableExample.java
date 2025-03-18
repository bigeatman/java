package dev.java.practice.ch04;

public class ForMultiplicationTableExample {
	public ForMultiplicationTableExample() {
		for (int m = 2; m <= 9; m++) {
			System.out.println(m + "단");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " * " + n + " = " + (m * n));
			}
		}
	}
}
