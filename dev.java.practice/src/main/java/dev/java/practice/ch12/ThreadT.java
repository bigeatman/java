package dev.java.practice.ch12;

public class ThreadT extends Thread {

	private WorkObject workObject;

	public ThreadT(WorkObject workObject) {
		super();
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA();
		}
	}
}
