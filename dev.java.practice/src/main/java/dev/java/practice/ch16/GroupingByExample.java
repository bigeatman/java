package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
	public GroupingByExample() {
		List<Student2> list = Arrays.asList(new Student2("홍길동", 10, Student2.Sex.MALE),
				new Student2("김수애", 6, Student2.Sex.FEMALE), new Student2("신용권", 10, Student2.Sex.MALE),
				new Student2("박수미", 6, Student2.Sex.FEMALE));

		Map<Student2.Sex, List<Student2>> mapBySex = list.stream().collect(Collectors.groupingBy(Student2::getSex));

		System.out.println("남학생");
		mapBySex.get(Student2.Sex.MALE).stream().forEach(s -> System.out.println(s.getName() + " "));
		System.out.println();
		
		System.out.println("여학생");
		mapBySex.get(Student2.Sex.FEMALE).stream().forEach(s -> System.out.println(s.getName() + " "));
	}
}