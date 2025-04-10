package dev.java.practice.ch07;

public class Tire {

	public int maxRotation;

	public int accumulatedRotation;

	public String location;

	public Tire(String location, int maxRotation) {
		super();
		this.maxRotation = maxRotation;
		this.location = location;
	}

	public boolean roll() {
		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("###" + location + " Tire 펑크 ###");
			return false;
		}
	}
}
