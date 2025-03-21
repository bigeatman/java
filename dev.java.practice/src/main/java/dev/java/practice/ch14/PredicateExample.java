package dev.java.practice.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	// @formatter:off
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("김자바", "남자", 95),
			new Student("박한나", "여자", 92)
	);
	//@formatter:on

	public static double avg(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;

		for (Student student : list) {
			if (predicate.test(student)) {
				count++;
				sum = sum + student.getScore();
			}
		}

		return (double) sum / count;
	}

	public PredicateExample() {
		double maleAvg = avg(t -> t.getSex().equals("남자"));
		double femaleAvg = avg(t -> t.getSex().equals("여자"));

		System.out.println("male avg : " + maleAvg);
		System.out.println("female avg : " + femaleAvg);
	}
}
