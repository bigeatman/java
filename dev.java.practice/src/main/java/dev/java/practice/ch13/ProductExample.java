package dev.java.practice.ch13;

import dev.java.practice.ch07.Car;

public class ProductExample {
	public ProductExample() {
		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");

		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");

		Car car = product2.getKind();
		String carModel = product2.getModel();
	}
}
