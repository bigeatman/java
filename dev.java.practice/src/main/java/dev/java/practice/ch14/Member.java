package dev.java.practice.ch14;

public class Member {
	private String name;
	private String id;
	private Address address;

	public Member(String name) {
		super();
		this.name = name;
	}

	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Member(String name, String id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
