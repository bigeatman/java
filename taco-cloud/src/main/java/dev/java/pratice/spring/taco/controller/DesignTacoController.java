package dev.java.pratice.spring.taco.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.model.Ingredient.Type;
import dev.java.pratice.spring.taco.model.Order;
import dev.java.pratice.spring.taco.model.Taco;
import dev.java.pratice.spring.taco.repository.IngredientRepository;
import dev.java.pratice.spring.taco.repository.TacoRepository;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {

	private final IngredientRepository ingredientRepo;

	private final TacoRepository tacoRepo;

	public DesignTacoController(IngredientRepository ingredientRepository, TacoRepository tacoRepo) {
		super();
		this.ingredientRepo = ingredientRepository;
		this.tacoRepo = tacoRepo;
	}

	@GetMapping
	public String showDesignFrom(Model model) {

		addIngredientToModel(model);

		model.asMap().computeIfAbsent("taco", key -> new Taco());

		return "design";
	}

	@PostMapping
	public String processingDesign(Model model, @Valid Taco design, Errors errors, @ModelAttribute Order order) {
		if (errors.hasErrors()) {
			addIngredientToModel(model);
			return "design";
		}

		log.info("Processing design : " + design);

		Taco saved = tacoRepo.save(design);
		order.addDesign(saved);

		return "redirect:/orders/current";
	}

	@ModelAttribute(name = "taco")
	public Taco taco() {
		return new Taco();
	}
	
	@ModelAttribute(name = "order")
	public Order order() {
		return new Order();
	}

	private void addIngredientToModel(Model model) {
		Map<Type, List<Ingredient>> map = ingredientRepo.findAll().stream()
				.collect(Collectors.groupingBy(Ingredient::getType));

		map.entrySet().forEach(e -> {
			model.asMap().computeIfAbsent(e.getKey().toString().toLowerCase(), v -> e.getValue());
		});
	}
}
