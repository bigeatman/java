package dev.java.practice.ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {
	public NoResultExample() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업 처리 요청]");

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				int sum = 0;
				int random = (int) (Math.random() * 100);
				System.out.println("[난수] :" + random);
				
				for (int i = 1; i <= random; i++) {
					sum = sum + i;
				}

				System.out.println("[처리 결과] : + " + sum);
			}
		};
		
		Future<?> future = executorService.submit(runnable);
		Future<?> future2 = executorService.submit(runnable);

		try {
			System.out.println(future.get());
			System.out.println(future2.get());
			System.out.println("[작업 처리 완료]");
		} catch (Exception e) {
			e.printStackTrace();
		}

		executorService.shutdown();
	}
}
