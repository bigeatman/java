package dev.java.practice.ch13;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {
	public MethodReferenceExample() {
		IntBinaryOperator operator;

		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println(operator.applyAsInt(1, 2));

		operator = Calculator::staticMethod;
		System.out.println(operator.applyAsInt(3, 4));

		operator = new Calculator()::instanceMethod;
		System.out.println(operator.applyAsInt(5, 6));
		
	}
}
