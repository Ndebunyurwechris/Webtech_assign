package com.coffee.model;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class CoffeeOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String name;
	
	
	private String orderer;
	
	
	private String quantity;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date")
	private LocalDate publicationdate;
	

	private String price;
	
	
	private String exports_or_imports;

	
	
	
	
	
	
	
	


	public CoffeeOrder(Long id, String name, String orderer, String quantity, LocalDate publicationdate, String price,
			String exports_or_imports) {
		super();
		this.id = id;
		this.name = name;
		this.orderer = orderer;
		this.quantity = quantity;
		this.publicationdate = publicationdate;
		this.price = price;
		this.exports_or_imports = exports_or_imports;
	}


	public CoffeeOrder() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOrderer() {
		return orderer;
	}


	public void setOrderer(String orderer) {
		this.orderer = orderer;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public LocalDate getPublicationdate() {
		return publicationdate;
	}


	public void setPublicationdate(LocalDate publicationdate) {
		this.publicationdate = publicationdate;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getExports_or_imports() {
		return exports_or_imports;
	}


	public void setExports_or_imports(String exports_or_imports) {
		this.exports_or_imports = exports_or_imports;
	}
	
	
	

	
	
		
}
