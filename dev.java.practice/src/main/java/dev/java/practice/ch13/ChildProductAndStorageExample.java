package dev.java.practice.ch13;

public class ChildProductAndStorageExample {
	public ChildProductAndStorageExample() {
		ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
		product.setKind(new Tv());
		product.setModel("SmartTv");
		product.setCompany("Samsung");

		Storage<Tv> storage = new StorageImpl<Tv>(100);
		storage.add(new Tv(), 0);

		Tv tv = storage.get(0);
	}
}
