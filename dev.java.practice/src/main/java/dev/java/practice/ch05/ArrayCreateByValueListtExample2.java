package dev.java.practice.ch05;

public class ArrayCreateByValueListtExample2 {
	public ArrayCreateByValueListtExample2() {
		int[] scores;
		scores = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("총합 : " + sum2);
		System.out.println();
	}

	private int add(int[] is) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += is[i];

		}
		return sum;
	}
}
