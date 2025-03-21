package dev.java.practice.ch03;

public class BitReverseOperatorExample {
	public BitReverseOperatorExample() {
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;

		System.out.println(toBinaryString(v1) + " (십진수 : " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수 : " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수 : " + v3 + ")");
	}

	private String toBinaryString(int v1) {
		String str = Integer.toBinaryString(v1);

		while (str.length() < 32) {
			str = "0" + str;
		}

		return str;
	}
}
