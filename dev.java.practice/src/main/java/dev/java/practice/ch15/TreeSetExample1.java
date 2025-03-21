package dev.java.practice.ch15;

import java.util.TreeSet;

public class TreeSetExample1 {
	public TreeSetExample1() {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(87);
		scores.add(80);

		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);

		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);

		score = scores.lower(95);
		System.out.println("95보다 낮은 점수 : " + score);

		score = scores.higher(95);
		System.out.println("95보다 높은 점수 : " + score);

		score = scores.floor(95);
		System.out.println("95이거나 낮은 점수 : " + score);

		score = scores.ceiling(95);
		System.out.println("95이거나 높은 점수 : " + score);

		while (scores.isEmpty() == false) {
			score = scores.pollFirst();
			System.out.println(score + " (남은 객체 수 : " + scores.size() + ")");
		}
	}
}
