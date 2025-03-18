package dev.java.practice.ch11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PtternExample {
	public static void main(String[] args) {
		String regexStr = "(02|010)\\-\\d{3,4}\\-\\d{4}";
		String data = "010-1234-1234";

		Pattern pattern = Pattern.compile(regexStr);
		Matcher matcher = pattern.matcher(data);

		matcher.find();
		
		for (int i = 0; i < matcher.groupCount(); i++) {
			System.out.println(matcher.group(i));
		}
	}
}
