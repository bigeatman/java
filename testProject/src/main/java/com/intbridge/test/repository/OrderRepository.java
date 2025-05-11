package com.intbridge.test.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.intbridge.test.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
	
	List<Order> findByUsersUsername(String username);
	
}
