package dev.java.practice.ch14;

import java.util.function.IntBinaryOperator;

public class LamdaExample {
	private static int[] scores = { 10, 50, 3 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];

		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}

		return result;
	}

	public LamdaExample() {
		int max = maxOrMin((x, y) -> x < y ? y : x);
		System.out.println(max);

		int min = maxOrMin((x, y) -> x > y ? y : x);
		System.out.println(min);
	}
}
