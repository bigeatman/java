package dev.java.practice.ch13;

import java.util.function.BiFunction;
import java.util.function.Function;

import dev.java.practice.ch14.Member;

public class ConstructorReferenceExample {
	public ConstructorReferenceExample() {
		Function<String, Member> function = Member::new;
		Member member1 = function.apply("angel");

		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("신천사", "angel");
	}
}
