package dev.java.practice.ch14;

import java.util.function.IntSupplier;

public class SupplierExample {
	public SupplierExample() {
		IntSupplier intSupplier = () -> {
			return (int) (Math.random() * 6) + 1;
		};

		int num = intSupplier.getAsInt();
		System.out.println(num);
	}
}
