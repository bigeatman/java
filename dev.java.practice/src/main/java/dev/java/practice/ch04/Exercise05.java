package dev.java.practice.ch04;

public class Exercise05 {
	public Exercise05() {
		for (int i = 0; i <= 10; i++) {
			for (int k = 0; k <= 10; k++) {
				if ((i * 4 + k * 5) == 60) {
					System.out.println(i + ", " + k);
				}
			}
		}
	}
}
