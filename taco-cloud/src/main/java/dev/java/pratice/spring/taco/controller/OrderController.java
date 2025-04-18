package dev.java.pratice.spring.taco.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import dev.java.pratice.spring.taco.config.OrderProps;
import dev.java.pratice.spring.taco.model.Order;
import dev.java.pratice.spring.taco.model.Users;
import dev.java.pratice.spring.taco.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {

	@Autowired
	private OrderProps orderProps;

	@Autowired
	private OrderRepository orderRepo;

	@GetMapping("/current")
	public String orderForm(@AuthenticationPrincipal Users users, @ModelAttribute Order order) {
		order.setDeliveryInfosFromUsers(users);
		return "orderform";
	}

	@PostMapping
	public String processOrder(@Valid Order order, Errors errors, SessionStatus ss,
			@AuthenticationPrincipal Users users) {

		if (errors.hasErrors()) {
			return "orderform";
		}

		order.setUsers(users);
		
		log.info("Order submittecd : " + order);
		orderRepo.save(order);
		ss.setComplete();

		return "redirect:/";
	}

	@GetMapping
	public String ordersForUser(@AuthenticationPrincipal Users user, Model model) {
		Pageable pageable = PageRequest.of(0, orderProps.getPageSize());
		model.addAttribute("orders", orderRepo.findByUsersOrderByPlacedAtDesc(user, pageable));
		return "orderList";
	}
}
