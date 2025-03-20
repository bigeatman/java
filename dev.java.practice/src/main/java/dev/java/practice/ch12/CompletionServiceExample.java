package dev.java.practice.ch12;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {
	public CompletionServiceExample() {
		ExecutorService ex = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(ex);

		System.out.println("[작업 처리 요청]");

		for (int i = 0; i < 3; i++) {
			completionService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					int sum = 0;
					int random = (int) (Math.random() * 100);
					System.out.println("난수 : " + random);

					for (int k = 0; k <= random; k++) {
						sum = sum + k;
					}

					return sum;
				}
			});
		}

		System.out.println("[처리 완료된 작업 확인]");
		ex.submit(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Future<Integer> future = completionService.take();
						int value = future.get();
						System.out.println("[처리 결과] : " + value);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		ex.shutdown();
	}
}
