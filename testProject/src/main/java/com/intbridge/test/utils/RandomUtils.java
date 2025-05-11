package com.intbridge.test.utils;

import java.util.Calendar;

public class RandomUtils {

	public static String randomString(int length) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < length; i++) {
			builder.append(randomChar());
		}

		return builder.toString();
	}

	public static String randomIntegerString(int length) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < length; i++) {
			builder.append(randomInteger(10));
		}

		return builder.toString();
	}

	public static String randomDate() {
		long randomMillis = randomMillis();

		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(randomMillis);

		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		return String.format(Literals.DATE_FORMAT, month, day);
	}

	private static long randomMillis() {
		return (long) (Math.random() * Literals.MILLIS_IN_YEAR); // 1년의 밀리초 범위
	}

	public static char randomChar() {
		int rand = randomInteger(26);
		return (char) (65 + rand);
	}

	public static int randomInteger(int maxValue) {
		return (int) (Math.random() * maxValue);
	}

}
