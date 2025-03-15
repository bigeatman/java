package dev.java.practice.ch8;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	public void turnOn();

	public void trunOff();

	public void setVolume(int volumn);

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	static void changeBattery() {
		System.out.println("배터리를 교체합니다.");
	}
}
