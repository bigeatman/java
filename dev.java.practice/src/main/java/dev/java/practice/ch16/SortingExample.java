package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {
	public SortingExample() {
		IntStream stream = Arrays.stream(new int[] { 5, 3, 2, 1, 4 });
		stream.sorted().forEach(System.out::println);

		List<Student> list = Arrays.asList(new Student("홍길동", 30), new Student("신용권", 10), new Student("유미선", 20));
		list.stream().sorted().forEach(System.out::println);
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
