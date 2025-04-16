package dev.java.pratice.spring.taco.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import dev.java.pratice.spring.taco.model.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {

}
