package dev.java.practice.ch6;

public class Calculator {

	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	int plus(int x, int y) {
		return x + y;
	}

	double divide(int x, int y) {
		return (double) x / y;
	}

	double avg(int x, int y) {
		double sum = plus(x, y);
		return sum / 2;
	}

	void execute() {
		double result = avg(7, 10);
		println("실행 결과 : " + result);
	}

	void println(String msg) {
		System.out.println(msg);
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

}
