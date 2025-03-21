package dev.java.practice.ch15;

import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {
	public TreeMapExample() {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(87, "홍길동");
		scores.put(98, "이동수");
		scores.put(75, "박길수");
		scores.put(95, "신용권");
		scores.put(80, "김자바");

		Entry<Integer, String> entry = null;

		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수 : " + entry.getValue());

		entry = scores.lastEntry();
		System.out.println("가장 높은 점수 : " + entry.getValue());

		entry = scores.lowerEntry(95);
		System.out.println("95보다 낮은 점수 : " + entry.getValue());

		entry = scores.higherEntry(95);
		System.out.println("95보다 높은 점수 : " + entry.getValue());

		entry = scores.floorEntry(95);
		System.out.println("95 >= 점수 : " + entry.getValue());

		entry = scores.ceilingEntry(95);
		System.out.println("95 <= 점수 : " + entry.getValue());

		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			System.out.println(entry.getKey() + " " + entry.getValue() + "(남은 객체 수 : " + scores.size() + ")");
		}
	}
}
