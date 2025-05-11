package dev.java.pratice.spring.taco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import dev.java.pratice.spring.taco.model.Person;

@RepositoryRestResource(path = "p")
public interface PersonRepository extends JpaRepository<Person, Long>{
	
    @RestResource(path = "newpreson")
    <S extends Person> S save(S person);
	
}
