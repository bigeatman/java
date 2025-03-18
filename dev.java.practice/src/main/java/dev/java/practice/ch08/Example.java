package dev.java.practice.ch08;

public class Example {
	public Example() {
		ImplmentationC c = new ImplmentationC();

		InterfaceA ia = c;
		ia.methodA();
		System.out.println();

		InterfaceB ib = c;
		ib.methodB();
		System.out.println();

		InterfaceC ic = c;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
