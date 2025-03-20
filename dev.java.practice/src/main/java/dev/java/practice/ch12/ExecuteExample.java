package dev.java.practice.ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuteExample {
	public ExecuteExample() throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 10; i++) {
			Runnable testRunnable = new Runnable() {

				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;

					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("총 스레드 갯수 : " + poolSize);
					System.out.println("작업 스레드 이름 : " + threadName);

					Integer.parseInt("aa");

				}
			};

//			executorService.execute(testRunnable);
			executorService.submit(testRunnable);
		}

		executorService.shutdown();
	}
}
