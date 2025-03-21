package dev.java.practice.ch14;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;

//		MyFunctionalInterface fi = (x, y) -> {
//			return arg + localVar;
//		};

		MyFunctionalInterface fi2 = new MyFunctionalInterface() {

			@Override
			public int method(int x, int y) {
				return arg + localVar;
			}
		};
	}
}
