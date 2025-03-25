package dev.java.practice.ch16;

import java.util.Arrays;

public class LoopingExample {
	public LoopingExample() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println("peek를 마지막에 호출한 경우");
		Arrays.stream(intArray).filter(num -> num % 2 == 0).peek(System.out::println);
		System.out.println();

		System.out.println("최종 처리 메서드를 마지막에 호출한 경우");
		int total = Arrays.stream(intArray).filter(num -> num % 2 == 0).peek(System.out::println).sum();
		System.out.println("결과 : " + total + "\n");

		System.out.println("forEach를 마지막에 호출한 경우");
		Arrays.stream(intArray).filter(num -> num % 2 != 0).forEach(System.out::println);
	}
}
