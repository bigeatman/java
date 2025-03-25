package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public StreamExample() {
		List<String> list = Arrays.asList("This is a java book", "Lamda Experssion",
				"Java8 supports lambda expressions");

		list.stream().filter(s -> s.toLowerCase().contains("java")).forEach(System.out::println);
	}

}
