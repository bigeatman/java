package dev.java.practice.ch14;

import java.util.function.Predicate;

public class PredicateIsEqualExample {
	public PredicateIsEqualExample() {
		Predicate<String> predicate;

		predicate = Predicate.isEqual(null);
		System.out.println("null, null : " + predicate.test(null));

		predicate = Predicate.isEqual("Java8");
		System.out.println("null, Java8 : " + predicate.test(null));

		predicate = Predicate.isEqual(null);
		System.out.println("Java8, null : " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java8");
		System.out.println("Java8, Java8 : " + predicate.test("Java8"));

		predicate = Predicate.isEqual("Java8");
		System.out.println("Java7, Java8 : " + predicate.test("Java7"));
	}
}
