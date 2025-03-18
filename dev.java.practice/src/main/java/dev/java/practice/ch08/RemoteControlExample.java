package dev.java.practice.ch08;

public class RemoteControlExample {
	public RemoteControlExample() {
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.trunOff();
		rc.setMute(true);

		rc = new Audio();
		rc.turnOn();
		rc.trunOff();
		rc.setMute(true);

		RemoteControl.changeBattery();
	}
}
