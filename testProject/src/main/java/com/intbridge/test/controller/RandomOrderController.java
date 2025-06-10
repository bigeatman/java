package com.intbridge.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intbridge.test.model.Ingredient;
import com.intbridge.test.model.Order;
import com.intbridge.test.model.Taco;
import com.intbridge.test.model.Users;
import com.intbridge.test.repository.IngredientRepository;
import com.intbridge.test.repository.OrderRepository;
import com.intbridge.test.repository.TacoRepository;
import com.intbridge.test.repository.UsersRepository;
import com.intbridge.test.utils.Literals;
import com.intbridge.test.utils.RandomUtils;

@RestController
@RequestMapping(path = "/order", produces = { "application/json" })
public class RandomOrderController {

	@Autowired
	private UsersRepository usersRepo;

	@Autowired
	private IngredientRepository ingredientRepo;

	@Autowired
	private TacoRepository tacoRepo;
	
	@Autowired
	private OrderRepository orderRepo;
	
	@GetMapping
	public ResponseEntity<Order> randomOrder() {

		Order order = createRandomOrder();
		order = orderRepo.save(order);
		
		return new ResponseEntity<>(order, HttpStatus.OK);
	}

	private Order createRandomOrder() {
		Order order = new Order();
		order.setDeliveryName(RandomUtils.randomString(4));
		order.setDeliveryStreet(RandomUtils.randomString(5));
		order.setDeliveryCity(RandomUtils.randomString(3));
		order.setDeliveryState(RandomUtils.randomString(6));
		order.setDeliveryZip(RandomUtils.randomIntegerString(5));
		order.setCcNumber(RandomUtils.randomIntegerString(16));
		order.setCcExpiration(RandomUtils.randomDate());
		order.setCcCVV(RandomUtils.randomIntegerString(3));

		List<Taco> tacos = createRandomTacos();
		order.addTacos(tacos);

		Users user = getRandomUser();
		user.setTotalOrderCount(user.getTotalOrderCount() + tacos.size());
		order.setUsers(user);
		
		usersRepo.save(user);
		
		return order;
	}
	
	private Users getRandomUser() {
		int userRandomIndex = RandomUtils.randomInteger(12);;
		Optional<Users> optional = usersRepo.findByUsername(Literals.USERS_ID[userRandomIndex]);
		Users users = null;
		
		if(optional.isPresent()) {
			users = optional.get();
		} else {
			throw new NoSuchElementException("Users " + Literals.USERS_ID[userRandomIndex] + " not found");
		}
		
		return users;
	}

	private List<Taco> createRandomTacos() {
		List<Taco> tacos = new ArrayList<>();
		int tacosCount = RandomUtils.randomInteger(5) + 5;
		for (int i = 0; i < tacosCount; i++) {
			Taco taco = createRandomTaco();
			taco = tacoRepo.save(taco);
			tacos.add(taco);
		}

		return tacos;
	}

	private Taco createRandomTaco() {
		Taco taco = new Taco();
		int ingredientCount = RandomUtils.randomInteger(4) + 1;
		
		for (int i = 0; i < ingredientCount; i++) {
			Ingredient ingredient = selectRandomIngredient();
			taco.addIngredient(ingredient);
		}

		String tacoName = RandomUtils.randomString(6);
		taco.setName(tacoName);
		
		return taco;
	}

	private Ingredient selectRandomIngredient() {
		int randomIngredient = RandomUtils.randomInteger(10);
		Optional<Ingredient> optional = ingredientRepo.findById(Literals.INGREDIENT_ID[randomIngredient]);

		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new NoSuchElementException("Ingredient " + Literals.INGREDIENT_ID[randomIngredient] + " not found");
		}
	}
}
