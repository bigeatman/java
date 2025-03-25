package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class StreamExample2 {
	public StreamExample2() {
		List<Member> list = Arrays.asList(new Member("홍길동", 30), new Member("신용권", 40), new Member("김자바", 26));

		double avg = list.stream().mapToDouble(Member::getAge).average().getAsDouble();
		System.out.println(avg);
	}
}
