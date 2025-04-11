package dev.java.pratice.spring.taco.convertor;

import org.springframework.core.convert.converter.Converter;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.repository.IngredientRepository;

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


/*

Exception encountered during context initialization 
- cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException:

 Error creating bean with name 'designTacoController' 
 defined in file [C:\Users\dudgp\문서\dev\eclipse-workspace\taco-cloud\target\classes\dev\java\pratice\spring\taco\controller\DesignTacoController.class]: 
 
 Unsatisfied dependency expressed through constructor parameter 1: 
 No qualifying bean of type 'dev.java.pratice.spring.taco.repository.TacoRepository' available: 
 expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}

*/
