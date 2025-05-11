package dev.java.pratice.spring.taco.convertor;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import dev.java.pratice.spring.taco.model.Taco;
import dev.java.pratice.spring.taco.model.TacoEntityModel;
import dev.java.pratice.spring.taco.rest.TacoRestController;

@Component
public class TacoEntityAssembler implements RepresentationModelAssembler<Taco, TacoEntityModel> {

	@Override
	public TacoEntityModel toModel(Taco taco) {
		TacoEntityModel model = new TacoEntityModel(taco);

		addSelfLink(taco, model);
		addUpdateLink(taco, model);
		addDeleteLink(taco, model);

		return model;
	}

	private void addDeleteLink(Taco taco, EntityModel<Taco> model) {
		Link deleteLink = linkTo(methodOn(TacoRestController.class).removeTaco(taco.getId())).withRel("delete");
		model.add(deleteLink);
	}

	private void addUpdateLink(Taco taco, EntityModel<Taco> model) {
		Link updateLink = linkTo(methodOn(TacoRestController.class).modifyTaco(taco.getId(), taco)).withRel("update");
		model.add(updateLink);
	}

	private void addSelfLink(Taco taco, EntityModel<Taco> model) {
		Link selfLink = linkTo(methodOn(TacoRestController.class).recentTacoPathVariable(taco.getId())).withSelfRel();
		model.add(selfLink);
	}

	@Override
	public CollectionModel<TacoEntityModel> toCollectionModel(Iterable<? extends Taco> entities) {
		CollectionModel<TacoEntityModel> collectionModel = RepresentationModelAssembler.super.toCollectionModel(
				entities);

		Link selfLink = linkTo(methodOn(TacoRestController.class).recentTacos()).withSelfRel();
		collectionModel.add(selfLink);
		return collectionModel;
	}
}
