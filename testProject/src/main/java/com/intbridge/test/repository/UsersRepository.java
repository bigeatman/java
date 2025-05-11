package com.intbridge.test.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.intbridge.test.model.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {
	
	Optional<Users> findByUsername(String username);
	
}
