package dev.java.pratice.spring.taco.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	@Size(min = 5, message = "Name musb be at least 5 charcters long")
	private String name;

	@ManyToMany(targetEntity = Ingredient.class)
	@NotNull(message = "You must choose at lesat 1 ingredient")
	@Size(min = 1, message = "You must choose at lesat 1 ingredient")
	@JoinTable(name = "taco_ingredients", joinColumns = @JoinColumn(name = "taco"), inverseJoinColumns = @JoinColumn(name = "ingredient"))
	private List<Ingredient> ingredients;

	@PrePersist
	void createdAt() {
		this.createAt = new Date();
	}
}
