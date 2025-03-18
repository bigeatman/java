package dev.java.practice.ch07;

public class StudentExample {
	public StudentExample() {
		Student student = new Student("홍길동", "123456-1234566", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}
