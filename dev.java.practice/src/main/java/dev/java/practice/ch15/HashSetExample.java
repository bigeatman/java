package dev.java.practice.ch15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public HashSetExample() {
		Set<String> set = new HashSet<String>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("총 개수 : " + size);

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String elem = iterator.next();
			System.out.println("\t" + elem);
		}

		set.remove("JDBC");
		set.remove("iBATIS");

		size = set.size();
		System.out.println("총 개수 : " + size);

		iterator = set.iterator();
		while (iterator.hasNext()) {
			String elem = iterator.next();
			System.out.println("\t" + elem);
		}

		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
