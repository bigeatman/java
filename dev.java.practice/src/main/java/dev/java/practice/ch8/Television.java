package dev.java.practice.ch8;

public class Television implements RemoteControl {

	private int volumn;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volumn) {
		if (volumn > MAX_VOLUME) {
			this.volumn = MAX_VOLUME;
		} else if (volumn < MIN_VOLUME) {
			this.volumn = MIN_VOLUME;
		} else {
			this.volumn = volumn;
		}

		System.out.println("현재 TV 볼륨 : " + this.volumn);
		
	}

}
