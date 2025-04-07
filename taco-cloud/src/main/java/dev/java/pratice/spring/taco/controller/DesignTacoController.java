package dev.java.pratice.spring.taco.controller;

//import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.java.pratice.spring.taco.model.Ingredient;
import dev.java.pratice.spring.taco.model.Ingredient.Type;
import dev.java.pratice.spring.taco.model.Taco;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

	private final OrderController orderController;

	Map<Type, List<Ingredient>> list = Ingredient.DEFAULT_INGREDIENTS.stream()
			.collect(Collectors.groupingBy(Ingredient::getType));

	DesignTacoController(OrderController orderController) {
		this.orderController = orderController;
	}

	@GetMapping
	public String showDesignFrom(Model model) {

		addIngredientToModel(model);

		model.asMap().computeIfAbsent("taco", key -> new Taco());

		return "design";
	}

	@PostMapping
	public String processingDesign(Model model, @Valid Taco design, Errors errors) {
		if (errors.hasErrors()) {
			addIngredientToModel(model);
			return "design";
		}

		log.info("Processing design : " + design);
		return "redirect:/orders/current";
	}

	private void addIngredientToModel(Model model) {
		list.forEach((key, value) -> {
			model.asMap().computeIfAbsent(key.toString().toLowerCase(), v -> value);
		});
	}
}
