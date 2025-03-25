package dev.java.practice.ch16;

import java.util.Arrays;

public class MatchExample {
	public MatchExample() {
		int[] intAry = { 2, 4, 6 };

		boolean result = Arrays.stream(intAry).allMatch(num -> num % 2 == 0);
		System.out.println(result);

		result = Arrays.stream(intAry).anyMatch(num -> num % 3 == 0);
		System.out.println(result);

		result = Arrays.stream(intAry).noneMatch(num -> num % 3 == 0);
		System.out.println(result);
	}
}
