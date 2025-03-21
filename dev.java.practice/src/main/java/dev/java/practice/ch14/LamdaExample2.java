package dev.java.practice.ch14;

import java.util.function.Function;

public class LamdaExample2 {

	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	private double avg(Function<Student, Integer> function) {
		int sum = 0;
		for (Student student : students) {
			sum = sum + function.apply(student);
		}

		return (double) sum / students.length;
	}

	public LamdaExample2() {
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println(englishAvg);
	}

}
