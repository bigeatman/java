package dev.java.pratice.spring.taco.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.CreditCardNumber;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "Taco_Order")
public class Order implements Serializable {

	private static final long serialVersionUID = -4388244347189082315L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name="placedat")
	private Date placedAt;

	@NotBlank(message = "Name is required")
	@Column(name="deliveryname")
	private String deliveryName;

	@NotBlank(message = "Street is required")
	@Column(name="deliverystreet")
	private String deliveryStreet;

	@NotBlank(message = "City is required")
	@Column(name="deliverycity")
	private String deliveryCity;

	@NotBlank(message = "State is required")
	@Column(name="deliverystate")
	private String deliveryState;

	@NotBlank(message = "Zip code is required")
	@Column(name="deliveryzip")
	private String deliveryZip;

	@CreditCardNumber(message = "Not a valid credit card Number")
	@Column(name="ccnumber")
	private String ccNumber;

	@Pattern(regexp = "^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$", message = "Not a valid expiration")
	@Column(name="ccexpiration")
	private String ccExpiration;

	@Digits(integer = 3, fraction = 0, message = "Invalid CVV")
	@Column(name="cccvv")
	private String ccCVV;

	@ManyToMany(targetEntity = Taco.class)
	@JoinTable(name = "taco_order_tacos", joinColumns = @JoinColumn(name = "tacoorder"), inverseJoinColumns = @JoinColumn(name = "taco"))
	private final List<Taco> tacos = new ArrayList<>();

	public void addDesign(Taco design) {
		this.tacos.add(design);
	}

	@PrePersist
	void platedAt() {
		this.placedAt = new Date();
	}
}
