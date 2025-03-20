package dev.java.practice.ch12;

public class InterruptExample {
	public InterruptExample() {
		Thread thread = new PrintThread2();
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		thread.interrupt();
	}
}
