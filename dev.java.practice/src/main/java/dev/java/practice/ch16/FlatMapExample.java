package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public FlatMapExample() {
		List<String> inputList = Arrays.asList("Java lamda", "stream mapping");
		inputList.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);

		List<String> inputList2 = Arrays.asList("10, 20, 30", "40, 50, 60");
		inputList2.stream().flatMap(data -> Arrays.stream(data.split(", "))).forEach(System.out::println);
		
	}
}
