package dev.java.practice.ch4;

public class ContinueExample {
	public ContinueExample() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}

			System.out.println(i);
		}
	}
}
