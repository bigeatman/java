package dev.java.pratice.spring.taco.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import dev.java.pratice.spring.taco.model.Order;
import dev.java.pratice.spring.taco.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {

	private OrderRepository orderRepo;

	public OrderController(OrderRepository orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}

	@GetMapping("/current")
	public String orderForm(Model model) {
		System.out.println(model.getAttribute("order"));
		return "orderform";
	}

	@PostMapping
	public String processOrder(@Valid Order order, Errors errors, SessionStatus ss) {
		if (errors.hasErrors()) {
			return "orderform";
		}

		log.info("Order submittecd : " + order);
		orderRepo.save(order);
		ss.setComplete();

		return "redirect:/";
	}

}
