package dev.java.practice.ch12;

public class PrintThread1 extends Thread {

	private boolean stop;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	@Override
	public void run() {
		int index = 0;

		while (!stop) {
			System.out.println("실행 중 : " + index++);
		}

		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}

}
