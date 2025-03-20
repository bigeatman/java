package dev.java.practice.ch13;

public class Container2<K, V> {

	private K key;

	private V value;

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K key() {
		return key;
	}

	public V value() {
		return value;
	}
}
