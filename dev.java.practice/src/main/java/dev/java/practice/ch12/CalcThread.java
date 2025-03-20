package dev.java.practice.ch12;

public class CalcThread extends Thread {

	public CalcThread(String name) {
		super.setName(name);
	}

	@Override
	public void run() {
		System.out.println(super.getName() + " started.");
		
		for (int i = 0; i < 2000000000; i++) {

		}

		System.out.println(super.getName() + " Priority : " + super.getPriority());
	}

}
