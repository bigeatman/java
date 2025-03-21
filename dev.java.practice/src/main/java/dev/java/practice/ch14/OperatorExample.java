package dev.java.practice.ch14;

import java.util.function.IntBinaryOperator;

public class OperatorExample {

	private static int[] scores = { 92, 95, 87 };

	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];

		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}

		return result;
	}

	public OperatorExample() {
		int max = maxOrMin((x, y) -> {
			return x < y ? y : x;
		});
		int min = maxOrMin((x, y) -> {
			return x > y ? y : x;
		});

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
