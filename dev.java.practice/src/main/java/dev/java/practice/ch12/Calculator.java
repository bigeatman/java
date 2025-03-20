package dev.java.practice.ch12;

public class Calculator {
	private int memory;

	public int getMeoery() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		System.out.println(Thread.currentThread().getName() + " started.");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
}
