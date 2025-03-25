package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AggregateExample {
	public AggregateExample() {
		long count = getStream().filter(AggregateExample::is2Multi).count();
		System.out.println("2의 배수 개수 : " + count);

		long sum = getStream().filter(AggregateExample::is2Multi).sum();
		System.out.println("2의 배수 합 : " + sum);

		double avg = getStream().filter(AggregateExample::is2Multi).average().getAsDouble();
		System.out.println("2의 배수으의 평균 : " + avg);

		int amx = getStream().filter(AggregateExample::is2Multi).max().getAsInt();
		System.out.println("2의 배수의 최대값 : " + amx);

		int min = getStream().filter(AggregateExample::is2Multi).min().getAsInt();
		System.out.println("2의 배수의 최소값 : " + min);

		int first = getStream().filter(AggregateExample::is2Multi).findFirst().getAsInt();
		System.out.println("2의 배수의 첫번째 값 : " + first);

		System.out.println(getStream().getClass().getName());

	}

	public static IntStream getStream() {
		return Arrays.stream(new int[] { 1, 2, 3, 4, 5 });
	}

	public static boolean is2Multi(int num) {
		return num % 2 == 0;
	}
}
