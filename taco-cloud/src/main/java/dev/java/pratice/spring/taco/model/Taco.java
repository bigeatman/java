package dev.java.pratice.spring.taco.model;

import java.util.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Taco {

	private Long id;

	private Date createdAt;

	@NotNull
	@Size(min = 5, message = "Name musb be at least 5 charcters long")
	private String name;

	@NotNull(message = "You must choose at lesat 1 ingredient")
	@Size(min = 1, message = "You must choose at lesat 1 ingredient")
	private List<Ingredient> ingredients;
}
