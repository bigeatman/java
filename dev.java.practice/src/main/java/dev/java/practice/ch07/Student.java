package dev.java.practice.ch07;

public class Student extends People {

	public int studentNo;

	public Student(String name, String ssn, int studnetNo) {
		super(name, ssn);
		this.studentNo = studnetNo;
	}
}
