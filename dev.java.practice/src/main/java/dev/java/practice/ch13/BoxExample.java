package dev.java.practice.ch13;

public class BoxExample {
	public BoxExample() {
		Box<String> box1 = new Box<String>();
		box1.setT("hello");
		String str = box1.getT();

		Box<Integer> box2 = new Box<Integer>();
		box2.setT(6);
		int value = box2.getT();
	}
}
