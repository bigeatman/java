package dev.java.practice.ch15;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public HashSetExample2() {
		Set<Member> set = new HashSet<>();
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));

		System.out.println(set.size());
	}
}
