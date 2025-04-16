package dev.java.pratice.spring.taco.repository;

import org.springframework.data.repository.CrudRepository;

import dev.java.pratice.spring.taco.model.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {

}
