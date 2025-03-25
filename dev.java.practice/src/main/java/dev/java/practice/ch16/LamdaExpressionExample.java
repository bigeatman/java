package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionExample {
	public LamdaExpressionExample() {
		List<Student> list = Arrays.asList(new Student("홍길동", 90), new Student("신용권", 92));

		Stream<Student> stream = list.stream();
		stream.forEach(stu -> {
			System.out.println(stu.name + " " + stu.score);
		});
	}
}
