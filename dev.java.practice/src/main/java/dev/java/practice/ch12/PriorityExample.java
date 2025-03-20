package dev.java.practice.ch12;

public class PriorityExample {
	public PriorityExample() {
		for (int i = 0; i < 10; i++) {
			Thread thread = new CalcThread("thread-" + i);

			thread.setPriority((int) (Math.random() * 9) + 1);
			
			thread.start();
		}
	}
}
