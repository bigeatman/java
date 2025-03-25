package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public StreamPipelinesExample() {
		// @formatter:off
		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30),
				new Member("홍길동", Member.FEMALE, 20),
				new Member("홍길동", Member.MALE, 45),
				new Member("홍길동", Member.FEMALE, 27)
		);
		// @formatter:on

		double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average().getAsDouble();
		System.out.println(ageAvg);
	}
}
