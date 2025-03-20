package dev.java.practice.ch12;

public class YieldExample {
	public YieldExample() {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();

		thread1.start();
		thread2.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.work = false;

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread1.stop = true;
		thread2.stop = true;

	}
}
