package com.intbridge.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.intbridge.test.model.Ingredient;
import com.intbridge.test.model.Ingredient.Type;
import com.intbridge.test.model.Users;
import com.intbridge.test.repository.IngredientRepository;
import com.intbridge.test.repository.UsersRepository;
import com.intbridge.test.utils.Literals;

@SpringBootApplication
public class TestProjectApplication {

	public static void main(String[] args) {
		 SpringApplication.run(TestProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner dataLoader(IngredientRepository ingredientRepo, UsersRepository usersRepo) {
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				createBaseIngredients(ingredientRepo);
				createBaseUsers(usersRepo);
			}

			private void createBaseIngredients(IngredientRepository repo) {
				for (int i = 0; i < Literals.INGREDIENT_ID.length; i++) {
					String id = Literals.INGREDIENT_ID[i];
					String name = Literals.INGREDIENT_NAME[i];
					Type type = Literals.INGREDIENT_TYPE[i];
					
					repo.save(new Ingredient(id, name, type));
				}
			}
			
			private void createBaseUsers(UsersRepository repo) {
				for(int i=0; i<Literals.USERS_ID.length; i++) {
					String id = Literals.USERS_ID[i];
					String ps = Literals.USERS_PS[i];
					String fullName = Literals.USERS_FULLNAME[i];
					
					repo.save(new Users(id, ps, fullName));
				}
			}
		};
	}
}
