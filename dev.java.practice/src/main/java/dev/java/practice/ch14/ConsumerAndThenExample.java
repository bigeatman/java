package dev.java.practice.ch14;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public ConsumerAndThenExample() {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA : " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("ConsumerB : " + m.getId());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
