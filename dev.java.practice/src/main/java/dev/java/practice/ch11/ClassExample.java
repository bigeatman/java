package dev.java.practice.ch11;

import dev.java.practice.ch06.Car;

public class ClassExample {
	public ClassExample() {
		Car car = new Car();
		Class<?> cls = car.getClass();

		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage().getName());
		System.out.println();

		try {
			Class<?> cls2 = Class.forName("dev.java.practice.ch7.Car");
			System.out.println(cls2.getName());
			System.out.println(cls2.getSimpleName());
			System.out.println(cls2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
