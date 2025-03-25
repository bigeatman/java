package dev.java.practice.ch16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public OptionalExample() {
		List<Integer> list = new ArrayList<>();

		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();

		if (optional.isPresent()) {
			System.out.println(optional.getAsDouble());
		} else {
			System.out.println("0.0");
		}

		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);

		list.stream().mapToInt(Integer::intValue).average().ifPresent(System.out::println);
	}
}
