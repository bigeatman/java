package dev.java.pratice.spring.taco.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.java.pratice.spring.taco.model.RegistrationForm;
import dev.java.pratice.spring.taco.repository.UsersRepository;

@Controller
@RequestMapping("/register")
public class RegistrationController {

	private UsersRepository userRepo;

	private PasswordEncoder passwordEncoder;

	public RegistrationController(UsersRepository userRepo, PasswordEncoder passwordEncoder) {
		super();
		this.userRepo = userRepo;
		this.passwordEncoder = passwordEncoder;
	}

	@GetMapping
	public String registerForm() {
		return "registration";
	}

	@PostMapping
	public String processingRegistration(RegistrationForm form) {
		userRepo.save(form.toUser(passwordEncoder));
		return "redirect:/login";
	}
}
