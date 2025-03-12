package dev.java.practice.ch3;

public class InfinityAndNanCheckExample {
	public InfinityAndNanCheckExample() {
		int x = 5;
		double y = 0.0;

		double z = x / y;
		double zz = x % y;

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));

		System.out.println(Double.isInfinite(zz));
		System.out.println(Double.isNaN(zz));

		System.out.println(z + 2);
		System.out.println(zz + 2);
	}
}
