package dev.java.pratice.spring.taco.model;

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
import javax.validation.constraints.Size;

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
