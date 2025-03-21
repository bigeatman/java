package dev.java.practice.ch14;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {
	public PredicateAndOrNegateExample() {
		IntPredicate predicateA = a -> a % 2 == 0;
		IntPredicate predicateB = a -> a % 3 == 0;

		IntPredicate predicateAB;
		boolean result;

		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println(result);

		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println(result);

		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println(result);
	}
}
