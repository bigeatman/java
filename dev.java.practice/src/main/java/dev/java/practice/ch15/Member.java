package dev.java.practice.ch15;

public class Member {
	public String name;

	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return (mem.name.equals(this.name)) && (mem.age == this.age);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
