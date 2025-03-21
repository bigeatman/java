package dev.java.practice.ch15;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListExample {
	public ArrayAsListExample() {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바");

		for (Object obj : list1) {
			System.out.println(obj);
		}

		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for (Object obj : list2) {
			System.out.println(obj);
		}
	}
}
