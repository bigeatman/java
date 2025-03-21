package dev.java.practice.ch15;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public TreeSetExample3() {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[c-f 사이의 단어 검색]");
		NavigableSet<String> navi = treeSet.subSet("c", true, "f", true);

		for (String word : navi) {
			System.out.println(word);
		}
	}
}
