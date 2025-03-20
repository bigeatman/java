package dev.java.practice.ch12;

public class BeepPrintExample3 {
	public BeepPrintExample3() throws Exception {
		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("alert");
			Thread.sleep(500);
		}
	}
}
