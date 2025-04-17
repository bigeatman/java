package dev.java.pratice.spring.taco.model;

import java.io.Serializable;
import java.util.ArrayList;
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
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

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
