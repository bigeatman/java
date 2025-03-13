package dev.java.practice.ch4;

public class IfNestedExample {
	public IfNestedExample() {
		int score = (int) (Math.random() * 20) + 81;
		System.out.println(score);

		String grade;

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
	}
}
