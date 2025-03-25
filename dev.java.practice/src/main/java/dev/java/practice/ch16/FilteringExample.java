package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public FilteringExample() {
		List<String> names = Arrays.asList("홍길동", "신용권", "김자바", "신용권", "신민철");

		names.stream().distinct().forEach(System.out::println);
		System.out.println();

		names.stream().filter(n -> n.contains("신")).forEach(System.out::println);
		System.out.println();

		names.stream().filter(n -> n.contains("신")).distinct().forEach(System.out::println);
	}
}
