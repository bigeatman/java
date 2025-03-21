package dev.java.practice.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {

	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용권", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			String result = function.apply(student);
			System.out.print(result + "\t");
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			int result = function.applyAsInt(student);
			System.out.print(result + "\t");
		}
		System.out.println();
	}

	public FunctionExample1() {
		System.out.print("[학생 이름]\t");
		printString(t -> t.getName());

		System.out.print("[영어 점수]\t");
		printInt(t -> t.getEnglishScore());

		System.out.print("[수학 점수]\t");
		printInt(m -> m.getMathScore());
	}
}
