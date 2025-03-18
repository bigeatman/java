package dev.java.practice.ch11;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public StringTokenizerExample() {
		String text = "a/b/c/d";

		StringTokenizer st = new StringTokenizer(text, "/");

		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
	}
}
