package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {
	public FromArrayExample() {
		String[] strArray = { "신용권", "홍길동", "김미나" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(str -> System.out.println(str));
		System.out.println();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(value -> System.out.println(value));
	}
}
