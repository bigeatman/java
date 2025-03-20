package dev.java.practice.ch12;

public class StopFlagExample {
	public StopFlagExample() {
		PrintThread1 pt1 = new PrintThread1();
		pt1.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		pt1.setStop(true);
	}
}
