package dev.java.practice.ch12;

public class Thread1 extends Thread {

	public boolean stop = false;

	public boolean work = true;

	@Override
	public void run() {
		while (stop == false) {
			if (work) {
				System.out.println("thread2 작업 내용");
			} else {
				Thread.yield();
			}
		}

		System.out.println("thread2 종료");
	}
}
