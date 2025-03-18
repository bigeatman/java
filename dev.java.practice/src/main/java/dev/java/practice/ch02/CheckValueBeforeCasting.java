package dev.java.practice.ch02;

public class CheckValueBeforeCasting {
	public CheckValueBeforeCasting() {
		int i = 128;

		if ((i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE)) {
			System.out.println("Byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
