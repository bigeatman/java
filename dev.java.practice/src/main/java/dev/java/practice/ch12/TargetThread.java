package dev.java.practice.ch12;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (long ik = 0; ik < 1000000000; ik++) {

			}
		}
	}
}
