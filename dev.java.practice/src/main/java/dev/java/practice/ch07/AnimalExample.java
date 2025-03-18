package dev.java.practice.ch07;

public class AnimalExample {
	public AnimalExample() {
		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();
		System.out.println("---------------");

		Animal animal = null;
		animal = dog;
		animal.sound();

		animal = cat;
		animal.sound();
		System.out.println("---------------");

		animalSound(new Dog());
		animalSound(new Cat());
	}

	private void animalSound(Animal animal) {
		animal.sound();
	}
}
