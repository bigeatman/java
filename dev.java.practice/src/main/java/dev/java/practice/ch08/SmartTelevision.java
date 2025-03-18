package dev.java.practice.ch08;

public class SmartTelevision implements RemoteControl, Searchable {

	private int volumn;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

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
