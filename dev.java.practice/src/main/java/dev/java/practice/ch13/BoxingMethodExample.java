package dev.java.practice.ch13;

public class BoxingMethodExample {
	public BoxingMethodExample() {
		Box<Integer> box1 = Util.<Integer>boxing(null);
		int intAValue = box1.getT();

		Box<String> box2 = Util.<String>boxing("홍길동");
		String stringVALUE = box2.getT();
	}
}
