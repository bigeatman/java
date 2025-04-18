package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
	public ParallelExample() {
		List<String> list = Arrays.asList("홍길동", "신용권", "람다식", "박병렬", "홍길동", "신용권", "람다식", "박병렬");

		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample::print);
		System.out.println();

		System.out.println("Test");
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelExample::print);
		System.out.println("Test");
	}

	private static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
