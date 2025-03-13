package dev.java.practice.ch4;

import java.util.Scanner;

public class SwitchStringExample {
	public SwitchStringExample() {
		String position = new Scanner(System.in).nextLine();

		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
	}
}
