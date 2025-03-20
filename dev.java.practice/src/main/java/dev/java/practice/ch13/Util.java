package dev.java.practice.ch13;

public class Util {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());

		return keyCompare & valueCompare;
	}

	public static <T extends Number> int compare(T t1, T t2) {
		return Double.compare(t1.doubleValue(), t2.doubleValue());
	}

	public static <K, V> V getValue(Pair<K, V> pair, K key) {
		if (pair.getKey().equals(key) == true) {
			return pair.getValue();
		} else {
			return null;
		}
	}
}
