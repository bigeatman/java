package dev.java.practice.ch12;

public class StatePrintThread extends Thread {

	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		super();
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟스레드 상태 : " + state);

			if (state == Thread.State.NEW) {
				targetThread.start();
			}

			if (state == Thread.State.TERMINATED) {
				break;
			}

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
