package dev.java.practice.ch12;

public class WaitNotifyExample {
	public WaitNotifyExample() {
		WorkObject obj = new WorkObject();
		WorkObject obj2 = new WorkObject();

		ThreadT tt = new ThreadT(obj);
		ThreadT2 tt2 = new ThreadT2(obj);
		
		ThreadT tt3 = new ThreadT(obj2);
		ThreadT2 tt23 = new ThreadT2(obj2);

		tt.start();
		tt2.start();
		tt3.start();
		tt23.start();
		
	}
}
