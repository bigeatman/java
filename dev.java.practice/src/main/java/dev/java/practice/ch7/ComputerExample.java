package dev.java.practice.ch7;

public class ComputerExample {
	public ComputerExample() {
		int r = 10;

		Calculator cal = new Calculator();
		System.out.println("원면적 : " + cal.areaCircle(r));
		System.out.println();

		Computer com = new Computer();
		System.out.println("원면적 : " + com.areaCircle(r));

	}
}
