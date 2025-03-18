package dev.java.practice.ch07;

public class ChildExample {
	public ChildExample() {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
