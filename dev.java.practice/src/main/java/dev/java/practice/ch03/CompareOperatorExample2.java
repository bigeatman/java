package dev.java.practice.ch03;

public class CompareOperatorExample2 {
	public CompareOperatorExample2() {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);
		System.out.println(v4 == (double) v5);
		System.out.println((int) (v4 * 10) == (int) (v5 * 10));
	}
}
