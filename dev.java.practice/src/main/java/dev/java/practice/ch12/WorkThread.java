package dev.java.practice.ch12;

public class WorkThread extends Thread {

	public WorkThread(ThreadGroup tg, String threadName) {
		super(tg, threadName);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(this.getName() + " interrupted");
				break;
			}
		}

		System.out.println(this.getName() + " 종료됨.");
	}
}
