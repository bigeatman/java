package dev.java.pratice.spring.taco.convertor;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

	private IngredientRepository ingredientRepo;

	public IngredientByIdConverter(IngredientRepository ingredientRepo) {
		super();
		this.ingredientRepo = ingredientRepo;
	}

	@Override
	public Ingredient convert(String id) {
		return ingredientRepo.findByid(id);
	}
}
