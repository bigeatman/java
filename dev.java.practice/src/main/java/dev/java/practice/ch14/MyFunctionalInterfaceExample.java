package dev.java.practice.ch14;

public class MyFunctionalInterfaceExample {
	public MyFunctionalInterfaceExample() {
		MyFunctionalInterface fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> x + y;
		System.out.println(fi.method(2, 5));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}

	private int sum(int x, int y) {
		return x + y;
	}
}
