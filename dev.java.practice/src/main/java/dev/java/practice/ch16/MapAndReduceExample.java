package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
	public MapAndReduceExample() {
		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30));
		double avg = list.stream().mapToInt(Student::getScore).average().getAsDouble();
		System.out.println(avg);
	}
}
