package dev.java.practice.ch12;

import java.awt.Toolkit;

public class BeepThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		for (int i = 0; i < 5; i++) {
			try {
				toolkit.beep();
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
