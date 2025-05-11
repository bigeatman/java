package com.intbridge.test.model;

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
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Taco_Order")
public class Order {

	@ManyToOne
	private Users users;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "placedat")
	private Date placedAt;

	@Column(name = "deliveryname")
	private String deliveryName;

	@Column(name = "deliverystreet")
	private String deliveryStreet;

	@Column(name = "deliverycity")
	private String deliveryCity;

	@Column(name = "deliverystate")
	private String deliveryState;

	@Column(name = "deliveryzip")
	private String deliveryZip;

	@Column(name = "ccnumber")
	private String ccNumber;

	@Column(name = "ccexpiration")
	private String ccExpiration;

	@Column(name = "cccvv")
	private String ccCVV;

	@ManyToMany(targetEntity = Taco.class)
	@JoinTable(name = "taco_order_tacos", joinColumns = @JoinColumn(name = "tacoorder"), inverseJoinColumns = @JoinColumn(name = "taco"))
	private final List<Taco> tacos = new ArrayList<>();

	@PrePersist
	void platedAt() {
		this.placedAt = new Date();
	}

	public void addTacos(List<Taco> tacos) {
		this.tacos.addAll(tacos);
	}
}
