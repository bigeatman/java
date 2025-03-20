package dev.java.practice.ch12;

public class JoinExample {
	public JoinExample() {
		SumThread st = new SumThread();
		st.start();

		try {
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1~100 합 : " + st.getSum());
	}
}
