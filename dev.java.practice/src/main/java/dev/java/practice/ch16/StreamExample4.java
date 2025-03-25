package dev.java.practice.ch16;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample4 {
	public StreamExample4() {
		List<Member> list = Arrays.asList(new Member("홍길동", "개발자"), new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));

		Map<String, List<String>> result = list.stream().collect(
				Collectors.groupingBy(Member::getJob, Collectors.mapping(Member::getName, Collectors.toList())));

		System.out.println("개발자");
		result.get("개발자").stream().forEach(System.out::println);

		System.out.println("디자이너");
		result.get("디자이너").stream().forEach(System.out::println);
	}
}
