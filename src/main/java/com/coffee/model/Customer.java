package com.coffee.model;

//import java.time.LocalDate;

//import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String quant;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuant() {
		return quant;
	}
	public void setQuant(String quant) {
		this.quant = quant;
	}
	public Customer(Long id, String name, String email, String quant) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.quant = quant;
	}
	public Customer() {
		super();
	}
	
	
	
	
	
   
}
