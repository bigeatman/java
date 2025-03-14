package dev.java.practice.ch7;

public class DriverExample {
	public DriverExample() {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
	}
}
