package com.coffee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer getUserByEmail(String email);
}
