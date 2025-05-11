package dev.java.pratice.spring.taco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.data.rest.core.annotation.RestResource;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final Long id;

	@NotNull
	private final String name;

	@NotNull
	private final Integer age;

}
