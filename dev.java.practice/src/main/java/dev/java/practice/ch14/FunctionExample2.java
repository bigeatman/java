package dev.java.practice.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;

		for (Student student : list) {
			int score = function.applyAsInt(student);
			sum = sum + score;
		}

		return (double) sum / list.size();
	}

	public FunctionExample2() {
		double englishAvg = avg(t -> t.getEnglishScore());
		double mathAvg = avg(t -> t.getMathScore());

		System.out.println(englishAvg + " " + mathAvg);
	} 
}
