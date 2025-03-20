package dev.java.practice.ch12;

public class ThreadGroupExample {
	public ThreadGroupExample() {
		ThreadGroup group = new ThreadGroup("myGroup");
		WorkThread a = new WorkThread(group, "threadA");
		WorkThread b = new WorkThread(group, "threadB");

		a.start();
		b.start();

		System.out.println("[main 스레드 그룹의 list() 메서드 출력 내용]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("[myGroup 스레드 그룹의 interrupt() 메서드 호출]");
		group.interrupt();
	}
}
