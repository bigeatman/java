package dev.java.practice.ch16;

public class Member {

	public static int MALE = 0;

	public static int FEMALE = 1;

	private String name;
	private int sex;
	private int age;
	private String job;

	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public Member(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}

	public Member(String string, int i) {
		this.name = string;
		this.age = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
