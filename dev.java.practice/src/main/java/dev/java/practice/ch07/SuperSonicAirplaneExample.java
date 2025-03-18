package dev.java.practice.ch07;

public class SuperSonicAirplaneExample {
	public SuperSonicAirplaneExample() {
		SuperSonicAirplane sa = new SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
