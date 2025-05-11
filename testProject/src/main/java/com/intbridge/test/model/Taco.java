package com.intbridge.test.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
public class Taco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "CREATEDAT")
	private Date createAt;

	@NotNull
	private String name;

	@ManyToMany(targetEntity = Ingredient.class)
	@JoinTable(name = "taco_ingredients", joinColumns = @JoinColumn(name = "taco"), inverseJoinColumns = @JoinColumn(name = "ingredient"))
	private List<Ingredient> ingredients;

	@PrePersist
	void createdAt() {
		this.createAt = new Date();
	}

	public void addIngredient(Ingredient ingredient) {
		if (this.ingredients == null) {
			this.ingredients = new ArrayList<>();
		}
		
		this.ingredients.add(ingredient);
	}
}
