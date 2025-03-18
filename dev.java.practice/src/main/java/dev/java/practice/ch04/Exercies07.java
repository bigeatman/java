package dev.java.practice.ch04;

import java.util.Scanner;

public class Exercies07 {
	public Exercies07() {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------------");
			System.out.print("선택 > ");

			int input = Integer.valueOf(scan.nextLine());

			switch (input) {
			case 1:
				System.out.print("입금할 금액 입력 : ");
				balance = changeBalance(scan, balance, true);
				break;
			case 2:
				System.out.print("출금할 금액 입력 : ");
				balance = changeBalance(scan, balance, false);
				break;
			case 3:
				System.out.println("현재 잔고 : " + balance);
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	private int changeBalance(Scanner scan, int balance, boolean isPlus) {
		int input = Integer.valueOf(scan.nextLine());

		if (isPlus) {
			return balance + input;
		} else {
			return balance - input;
		}
	}
}
