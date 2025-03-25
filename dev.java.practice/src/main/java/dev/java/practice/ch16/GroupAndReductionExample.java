package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAndReductionExample {
	public GroupAndReductionExample() {
		List<Student2> list = Arrays.asList(new Student2("홍길동", 10, Student2.Sex.MALE),
				new Student2("김수애", 6, Student2.Sex.FEMALE), new Student2("신용권", 10, Student2.Sex.MALE),
				new Student2("박수미", 6, Student2.Sex.FEMALE));

		Map<Student2.Sex, Double> map = list.stream()
				.collect(Collectors.groupingBy(Student2::getSex, Collectors.averagingDouble(Student2::getScore)));

		System.out.println("남자평균 : " + map.get(Student2.Sex.MALE));
		System.out.println("여자평균 : " + map.get(Student2.Sex.FEMALE));

		Map<Student2.Sex, String> map2 = list.stream().collect(Collectors.groupingBy(Student2::getSex,
				Collectors.mapping(Student2::getName, Collectors.joining(","))));

	}
}
