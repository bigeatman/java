package dev.java.practice.ch12;

public class ThreadStateExample {
	public ThreadStateExample() {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
