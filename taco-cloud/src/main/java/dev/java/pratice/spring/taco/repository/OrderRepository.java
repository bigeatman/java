package dev.java.pratice.spring.taco.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import dev.java.pratice.spring.taco.model.Order;
import dev.java.pratice.spring.taco.model.Users;

public interface OrderRepository extends CrudRepository<Order, Long> {

	List<Order> findByUsersOrderByPlacedAtDesc(Users user);

	List<Order> findByUsersOrderByPlacedAtDesc(Users user, Pageable pageable);

}
