package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
	public FromCollectionExample() {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30));

		Stream<Student> stream = list.stream();
		stream.forEach(s -> System.out.println(s.getName()));
	}
}
