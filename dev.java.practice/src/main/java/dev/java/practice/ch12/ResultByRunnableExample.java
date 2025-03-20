package dev.java.practice.ch12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByRunnableExample {
	public ResultByRunnableExample() {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		System.out.println("[작업 처리 요청]");

		Result result = new Result();
		Runnable task1 = new Task(result);
		Runnable task2 = new Task(result);

		Future<Result> future = executorService.submit(task1, result);
		Future<Result> future2 = executorService.submit(task1, result);

		try {
			result = future.get();
			result = future2.get();
			System.out.println("[처리 결과] : " + result.accumValue);
		} catch (Exception e) {
			e.printStackTrace();
		}

		executorService.shutdown();
	}

	private class Task implements Runnable {

		Result result;

		public Task(Result result) {
			this.result = result;
		}

		@Override
		public void run() {
			int sum = 0;
			int random = (int) (Math.random() * 100);

			for (int i = 0; i <= random; i++) {
				sum = sum + i;
			}

			System.out.println(sum);
			result.addValue(sum);
		}
	}

	private class Result {
		int accumValue;

		synchronized void addValue(int value) {
			this.accumValue = this.accumValue + value;
		}
	}
}
