package com.intbridge.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.intbridge.test.model.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
	

}
