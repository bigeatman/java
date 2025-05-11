package com.intbridge.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intbridge.test.model.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, String> {

}
