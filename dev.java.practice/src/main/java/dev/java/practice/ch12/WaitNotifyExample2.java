package dev.java.practice.ch12;

public class WaitNotifyExample2 {
	public WaitNotifyExample2() {
		DataBox dataBox = new DataBox();

		ProducerThread pt = new ProducerThread(dataBox);
		ConsumerThread ct = new ConsumerThread(dataBox);

		pt.start();
		ct.start();
	}
}
