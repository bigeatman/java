package dev.java.practice.ch12;

public class BeepPrintExample2 {
	public BeepPrintExample2() throws Exception {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("alert");
			Thread.sleep(500);
		}
	}
}
