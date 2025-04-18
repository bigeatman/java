package dev.java.practice.ch03;

public class IncreaseDecreaseOperatorExample {
	public IncreaseDecreaseOperatorExample() {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("---");
		x++;
		++x;
		System.out.println("x : " + x);

		System.out.println("---");
		y--;
		--y;
		System.out.println("y : " + y);

		System.out.println("---");
		z = x++;
		System.out.println("z : " + z);
		System.out.println("x : " + x);

		System.out.println("---");
		z = ++x;
		System.out.println("z : " + z);
		System.out.println("x : " + x);

		System.out.println("---");
		z = ++x + y++;

		System.out.println("z : " + z);
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
