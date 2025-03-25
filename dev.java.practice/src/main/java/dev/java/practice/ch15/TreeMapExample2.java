package dev.java.practice.ch15;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public TreeMapExample2() {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길수");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		Set<Entry<Integer, String>> entrySet = scores.descendingMap().entrySet();

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();

		entrySet = scores.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
