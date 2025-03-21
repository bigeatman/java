package dev.java.practice.ch15;

public class Board {
	String subject;
	String content;
	String wirter;

	public Board(String subject, String content, String wirter) {
		super();
		this.subject = subject;
		this.content = content;
		this.wirter = wirter;
	}

	@Override
	public String toString() {
		return "Board [subject=" + subject + ", content=" + content + ", wirter=" + wirter + "]\n";
	}

}
