package dev.java.practice.ch8;

public class Audio implements RemoteControl {

	private int volumn;

	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");

	}

	@Override
	public void trunOff() {
		System.out.println("Audio를 끕니다.");
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

		System.out.println("현재 Audio 볼륨 : " + this.volumn);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;

		if (mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}

}
