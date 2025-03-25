package dev.java.practice.ch16;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	static int sum = 0;

	public FromIntRangeExample() {

		IntStream stream = IntStream.rangeClosed(1, 100);

		stream.forEach(a -> sum = sum + a);

		System.out.println(sum);
	}
}
