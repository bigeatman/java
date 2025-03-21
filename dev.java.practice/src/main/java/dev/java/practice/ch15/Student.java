package dev.java.practice.ch15;

public class Student {

	public String name;
	public int sno;

	public Student(String name, int sno) {
		super();
		this.name = name;
		this.sno = sno;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return (this.name.equals(stu.name)) && (this.sno == stu.sno);
		} else {
			return false;
		}
	}

}
