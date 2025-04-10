package dev.java.practice.ch03;

public class StringEqualsExample {
	public StringEqualsExample() {
		String strVal1 = "신민철";
		String strVal2 = "신민철";
		String strVal3 = new String("신민철");

		System.out.println(strVal1 == strVal2);
		System.out.println(strVal1 == strVal3);
		System.out.println();
		System.out.println(strVal1.equals(strVal2));
		System.out.println(strVal1.equals(strVal3));

		System.out.println(System.identityHashCode("신민철"));
		System.out.println(System.identityHashCode(strVal1));
		System.out.println(System.identityHashCode(strVal2));
	}
}
