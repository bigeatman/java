package dev.java.practice.ch05;

public class ArrayLengthExample {
	public ArrayLengthExample() {
		int[] scores = { 83, 90, 87 };

		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}

		System.out.println("총합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}
}
