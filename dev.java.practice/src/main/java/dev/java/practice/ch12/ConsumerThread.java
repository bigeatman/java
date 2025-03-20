package dev.java.practice.ch12;

public class ConsumerThread extends Thread {

	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		super();
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = dataBox.getData();
			System.out.println("ConsummerThread가 읽은 데이터 : " + data);
		}
	}
}
