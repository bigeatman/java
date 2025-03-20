package dev.java.practice.ch13;

public class ContainerExample2 {
	public ContainerExample2() {
		Container2<String, String> container1 = new Container2<String, String>();
		container1.set("홍길동", "도적");

		String name1 = container1.key();
		String job = container1.value();

		Container2<String, Integer> container2 = new Container2<String, Integer>();
		container2.set("홍길동", 35);

		String name2 = container2.key();
		int age = container2.value();
	}
}
