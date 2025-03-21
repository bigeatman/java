package dev.java.practice.ch14;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public ConsumerExample() {
		Consumer<String> consumer = t -> System.out.println(t);
		consumer.accept("java");

		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");

		DoubleConsumer doubleConsumer = d -> System.out.println(d);
		doubleConsumer.accept(8.0);

		ObjIntConsumer<String> oic = (t, i) -> System.out.println(t + i);
		oic.accept("Java", 8);
	}
}


/*
Consumer : 매개 변수만 있음
Supplier : 반환만 있음
Function : 매개 변수와 반환 둘다 있음. 둘다 타입 지정 가능
Operator : 매개 변수와 반환 둘다 있음. 매개 변수 타입 지정하면 반환까지 같은 타입으로 지정됨.
Predicate : 매개 변수와 반환 둘다 있음. 매개 변수 타입 지정 가능하지만 반환은 boolean
*/