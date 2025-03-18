package dev.java.practice.ch05;

public class AdvancedForExample {
	public AdvancedForExample() {
		int[] scores = { 95, 71, 84, 93, 87 };

		int sum = 0;

		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
