package dev.java.practice.ch12;

public class PrintThread2 extends Thread {

	@Override
	public void run() {

		while (true) {
			System.out.println("실행 중");
			if (this.isInterrupted()) {
				break;
			}
		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
