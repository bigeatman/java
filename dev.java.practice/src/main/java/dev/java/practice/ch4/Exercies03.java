package dev.java.practice.ch4;

public class Exercies03 {
	public Exercies03() {
		int sum = 0;

		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0) {
				sum = sum + i;
			}
		}

		System.out.println(sum);
	}
}
