package dev.java.practice.ch13;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferenceExample {
	public ArgumentMethodReferenceExample() {
		ToIntBiFunction<String, String> function;

		function = (a, b) -> a.compareToIgnoreCase(b);
		print(function.applyAsInt("Java8", "JAVA8"));

		function = String::compareToIgnoreCase;
		print(function.applyAsInt("Java8", "JAVA8"));
	}

	private void print(int order) {
		if (order < 0) {
			System.out.println("사전순으로 먼저 옵니다.");
		} else if (order == 0) {
			System.out.println("사전순으로 동일합니다.");
		} else {
			System.out.println("사전순으로 나중에 옵니다.");
		}
	}
}
