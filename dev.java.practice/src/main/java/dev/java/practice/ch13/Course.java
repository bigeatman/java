package dev.java.practice.ch13;

public class Course<T> {

	private String name;

	private T[] students;

	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return this.name;
	}

	public T[] getStudents() {
		return this.students;
	}

	public void add(T student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}
}
