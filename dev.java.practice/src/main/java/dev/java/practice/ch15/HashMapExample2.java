package dev.java.practice.ch15;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public HashMapExample2() {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student("홍길동", 1), 95);
		map.put(new Student("홍길동", 1), 95);

		System.out.println("총 엔티티 수 : " + map.size());
	}
}
