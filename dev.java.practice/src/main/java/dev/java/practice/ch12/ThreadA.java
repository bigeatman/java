package dev.java.practice.ch12;

public class ThreadA extends Thread {
	public ThreadA() {
		super.setName("ThreadA");
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName() + " 가 실행한 내용");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
