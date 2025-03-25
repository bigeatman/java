package dev.java.practice.ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaleStudent {

	private List<Student2> list;

	public MaleStudent() {
		list = new ArrayList<>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}

	public void accumulate(Student2 student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}

	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	public List<Student2> getList() {
		return this.list;
	}

	@Override
	public String toString() {
		return Arrays.toString(list.toArray());
	}
}
