package dev.java.practice.ch15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public ArrayListExample() {
		List<String> list = new ArrayList<String>();

		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DtatBase");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	}
}
