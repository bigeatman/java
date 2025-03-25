package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {
	public AsDoubleStreamAndBoxedExample() {
		int[] intAry = new int[] { 1, 2, 3, 4, 5 };

		IntStream stream = Arrays.stream(intAry);
		stream.asDoubleStream().forEach(System.out::println);
		System.out.println();

		stream = Arrays.stream(intAry);
		stream.boxed().forEach(d -> System.out.println(d.intValue()));
	}
}
