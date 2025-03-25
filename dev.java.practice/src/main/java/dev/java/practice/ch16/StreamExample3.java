package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;

public class StreamExample3 {
	public StreamExample3() {
		List<Member> list = Arrays.asList(new Member("홍길동", "개발자"), new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		List<Member> dev = list.stream().filter(m -> m.getJob().equals("개발자")).toList();

		dev.stream().forEach(m -> System.out.println(m.getName()));
	}
}
