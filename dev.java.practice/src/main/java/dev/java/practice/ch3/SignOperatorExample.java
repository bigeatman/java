package dev.java.practice.ch3;

public class SignOperatorExample {
	public SignOperatorExample() {
		int x = -100;
		int result = +x;
		int result2 = -x;

		System.out.println("Result1 : " + result);
		System.out.println("Result2 : " + result2);

		short s = 100;
		// short result3 = -s; // 컴파일 에러
		int result3 = -s;
		System.out.println("Result3 : " + result3);

	}
}
