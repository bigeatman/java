package dev.java.pratice.spring.taco.repository;

import org.springframework.data.repository.CrudRepository;

import dev.java.pratice.spring.taco.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {

}
