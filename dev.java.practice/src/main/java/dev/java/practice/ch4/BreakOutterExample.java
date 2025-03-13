package dev.java.practice.ch4;

public class BreakOutterExample {
	public BreakOutterExample() {
		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}

		System.out.println("프로그램 종료");

	}
}
