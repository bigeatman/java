package dev.java.practice.ch12;

import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {
	public ThreadInfoExample() {
		AutoSaveThread asv = new AutoSaveThread();
		asv.setName("AutoSaveThread");
		asv.setDaemon(true);
		asv.start();

		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();

		for (Thread thread : threads) {
			System.out.println("Name : " + thread.getName());
			System.out.println("소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println("isDaemon : " + thread.isDaemon() + "\n");
		}
	}
}
