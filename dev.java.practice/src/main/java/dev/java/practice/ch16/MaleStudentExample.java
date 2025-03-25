package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public MaleStudentExample() {
		List<Student2> list = Arrays.asList(new Student2("홍길동", 10, Student2.Sex.MALE),
				new Student2("김수애", 6, Student2.Sex.FEMALE), new Student2("신용권", 10, Student2.Sex.MALE),
				new Student2("박수미", 6, Student2.Sex.FEMALE));

		MaleStudent ms = list.stream().collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::combine);

		ms.getList().stream().forEach(System.out::println);
	}
}
