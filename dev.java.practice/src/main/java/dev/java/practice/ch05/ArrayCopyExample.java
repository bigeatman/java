package dev.java.practice.ch05;

public class ArrayCopyExample {
	public ArrayCopyExample() {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
	}
}
