package dev.java.practice.ch14;

public class UsingThis {

	public int num1 = 10;

	public class Inner {
		int num2 = 20;

		void method() {
			MyFunctionalInterface fi = (x, y) -> {
				int result = UsingThis.this.num1 + this.num2;
				System.out.println(result);
				return result;
			};
			
			fi.method(1,2);
		}
	}
}
