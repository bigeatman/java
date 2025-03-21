package dev.java.practice.ch14;

public class RunnableExample {
	public RunnableExample() {
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		};

		Thread thread = new Thread(runnable);

		Thread thread2 = new Thread(() -> {
			for (char i = 'a'; i <= 'z'; i++) {
				System.out.print(i);
			}
		});

		thread.start();
		thread2.start(); 
	}
}
