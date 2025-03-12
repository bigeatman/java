package dev.java.practice.ch2;

public class GarbageValueExample {

	public GarbageValueExample() {
		byte var1 = 125;
		int var2 = 125;

		for (int i = 0; i < 5; i++) {
			var1++;
			var2++;
			String str = String.format("var1: %d,\tvar2 : %d", var1, var2);
			System.out.println(str);
		}
	}

}
