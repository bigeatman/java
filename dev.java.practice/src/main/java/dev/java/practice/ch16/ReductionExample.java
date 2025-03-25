package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public ReductionExample() {
		List<Student> list = Arrays.asList(new Student("홍길동", 92), new Student("신용권", 95), new Student("유미선", 88));

		int sum = list.stream().mapToInt(Student::getScore).sum();
		int sum2 = list.stream().map(Student::getScore).reduce((a, b) -> a + b).get();
		int sum3 = list.stream().map(Student::getScore).reduce(0, (a, b) -> a + b);

		System.out.println(sum + " " + sum2 + " " + sum3);
	}
}
