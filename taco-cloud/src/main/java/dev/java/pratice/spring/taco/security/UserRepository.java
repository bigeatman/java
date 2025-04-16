package dev.java.pratice.spring.taco.security;

import org.springframework.data.repository.CrudRepository;

import dev.java.pratice.spring.taco.security.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public User findByUsername(String username);

}
