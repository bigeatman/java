package dev.java.pratice.spring.taco.model;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.core.Relation;

@Relation(value = "taco", collectionRelation = "tacos")
public class TacoEntityModel extends EntityModel<Taco> {

	public TacoEntityModel(Taco taco) {
		super(taco);
	}
	
}
