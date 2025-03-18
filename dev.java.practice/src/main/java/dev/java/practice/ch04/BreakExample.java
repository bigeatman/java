package dev.java.practice.ch04;

public class BreakExample {
	public BreakExample() {
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);

			if (num == 6) {
				break;
			}
		}

		System.out.println("프로그램 종료");
	}
}
