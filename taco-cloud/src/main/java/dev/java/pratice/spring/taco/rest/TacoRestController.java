package dev.java.pratice.spring.taco.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.java.pratice.spring.taco.convertor.TacoEntityAssembler;
import dev.java.pratice.spring.taco.model.Taco;
import dev.java.pratice.spring.taco.model.TacoEntityModel;
import dev.java.pratice.spring.taco.repository.TacoRepository;

@RestController
@RequestMapping(path = "/taco", produces = { "application/json", "text/xml" })
@CrossOrigin(origins = "*")
public class TacoRestController {

	@Autowired
	private TacoRepository tacoRepo;

	@Autowired
	private TacoEntityAssembler tacoEntityAssembler;

	@GetMapping("/recents")	
	public CollectionModel<TacoEntityModel> recentTacos() {
		PageRequest page = PageRequest.of(0, 12, Sort.by("createAt").descending());

		List<Taco> tacos = tacoRepo.findAll(page).getContent();
		CollectionModel<TacoEntityModel> model = tacoEntityAssembler.toCollectionModel(tacos);

		return model;
	}

	@GetMapping("/recent/{id}")
	public ResponseEntity<TacoEntityModel> recentTacoPathVariable(@PathVariable Long id) {
		return findTaco(id);
	}

	private ResponseEntity<TacoEntityModel> findTaco(Long id) {
		Optional<Taco> taco = tacoRepo.findById(id);

		if (taco.isPresent()) {
			return new ResponseEntity<>(tacoEntityAssembler.toModel(taco.get()), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/create")
	public ResponseEntity<TacoEntityModel> postTaco(@RequestBody Taco taco) {
		return new ResponseEntity<>((tacoEntityAssembler.toModel(tacoRepo.save(taco))), HttpStatus.CREATED);
	}

	@PatchMapping("/modify/{id}")
	public ResponseEntity<TacoEntityModel> modifyTaco(@PathVariable Long id, @RequestBody Taco taco) {
		Optional<Taco> targetTacoOptional = tacoRepo.findById(id);

		if (targetTacoOptional.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

		Taco targetTaco = targetTacoOptional.get();

		if (taco.getCreateAt() != null) {
			targetTaco.setCreateAt(taco.getCreateAt());
		}

		if (taco.getIngredients() != null) {
			targetTaco.setIngredients(taco.getIngredients());
		}

		if (taco.getName() != null) {
			targetTaco.setName(taco.getName());
		}

		return new ResponseEntity<>(tacoEntityAssembler.toModel(tacoRepo.save(targetTaco)), HttpStatus.CREATED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<TacoEntityModel> removeTaco(@PathVariable Long id) {
		Optional<Taco> optional = tacoRepo.findById(id);

		if (optional.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}

		Taco target = optional.get();
		tacoRepo.delete(target);

		return new ResponseEntity<>(tacoEntityAssembler.toModel(target), HttpStatus.OK);
	}
}
