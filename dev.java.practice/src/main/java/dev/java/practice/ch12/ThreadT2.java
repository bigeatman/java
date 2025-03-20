package dev.java.practice.ch12;

public class ThreadT2 extends Thread {

	private WorkObject workObject;

	public ThreadT2(WorkObject workObject) {
		super();
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}
