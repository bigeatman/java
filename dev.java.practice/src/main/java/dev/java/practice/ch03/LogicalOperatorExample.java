package dev.java.practice.ch03;

public class LogicalOperatorExample {
	public LogicalOperatorExample() {
		int charCode = 'A';

		if ((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자");
		}

		if ((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자");
		}

		if ((charCode >= 48) && (charCode <= 57)) {
			System.out.println("0 ~ 9 숫자");
		}

		int value = 6;

		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2의 배수 또는 3의 배수");
		}
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2의 배수 또는 3의 배수");
		}
		
	}
}
