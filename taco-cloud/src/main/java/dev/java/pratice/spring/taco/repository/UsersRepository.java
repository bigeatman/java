package dev.java.pratice.spring.taco.repository;

import org.springframework.data.repository.CrudRepository;

import dev.java.pratice.spring.taco.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {

	Users findByUsername(String username);
}
