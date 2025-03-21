package dev.java.practice.ch14;

public class UsingThisExample {
	public UsingThisExample() {
		UsingThis us = new UsingThis();
		UsingThis.Inner inner = us.new Inner();
		inner.method();
	}
}
