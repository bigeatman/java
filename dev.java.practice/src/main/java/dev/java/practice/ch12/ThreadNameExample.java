package dev.java.practice.ch12;

public class ThreadNameExample {
	public ThreadNameExample() {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());

		ThreadA tA = new ThreadA();
		System.out.println("작업 스레드 이름 : " + tA.getName());
		tA.start();

		ThreadB tB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + tB.getName());
		tB.start();
	}
}
