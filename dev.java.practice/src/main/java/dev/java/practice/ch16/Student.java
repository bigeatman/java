package dev.java.practice.ch16;

public class Student implements Comparable<Student> {
	public String name;
	public int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student stu) {
		return Integer.compare(this.score, stu.score);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}
