package dev.java.practice.ch16;

public class Student2 {

	public static enum Sex {
		MALE, FEMALE
	};

	public enum City {
		SEOUL, PUSAN
	}

	private String name;
	private int score;
	private Sex sex;
	private City city;

	public Student2(String name, int score, Sex sex) {
		super();
		this.name = name;
		this.score = score;
		this.sex = sex;
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

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", score=" + score + ", sex=" + sex + ", city=" + city + "]";
	}

}
