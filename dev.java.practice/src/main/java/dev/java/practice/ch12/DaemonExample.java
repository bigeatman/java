package dev.java.practice.ch12;

public class DaemonExample {
	public DaemonExample() {
		AutoSaveThread asv = new AutoSaveThread();
		asv.setDaemon(true);
		asv.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("메인 스레드 종료");
	}
}
