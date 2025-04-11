package dev.java.pratice.spring.taco.repository;

import java.util.List;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.model.Taco;

public interface IngredientRepository {

	List<Ingredient> findAll();

	Ingredient findByid(String id);

	Ingredient save(Ingredient ingredient);
}
