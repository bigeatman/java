package dev.java.pratice.spring.taco.repository;

import dev.java.pratice.spring.taco.model.Order;

public interface OrderRepository {

	Order save(Order order);
}
