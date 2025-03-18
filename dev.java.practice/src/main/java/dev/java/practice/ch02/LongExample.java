package dev.java.practice.ch02;

public class LongExample {
	public LongExample() {
		long var1 = 10;
		long var2 = 20;
		// long var3 = 10000000000; //컴파일 에러
		long var4 = 10000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
