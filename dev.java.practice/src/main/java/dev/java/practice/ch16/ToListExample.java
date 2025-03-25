package dev.java.practice.ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public ToListExample() {
		List<Student2> list = Arrays.asList(new Student2("홍길동", 10, Student2.Sex.MALE),
				new Student2("김수애", 6, Student2.Sex.FEMALE), new Student2("신용권", 10, Student2.Sex.MALE),
				new Student2("박수미", 6, Student2.Sex.FEMALE));

		List<Student2> maleList = list.stream().filter(s -> s.getSex().equals(Student2.Sex.MALE))
				.collect(Collectors.toCollection(ArrayList::new));
		maleList.stream().forEach(System.out::println);

		System.out.println();

		Set<Student2> femaleList = list.stream().filter(s -> s.getSex().equals(Student2.Sex.FEMALE))
				.collect(Collectors.toCollection(HashSet::new));
		femaleList.stream().forEach(System.out::println);
	}
}
