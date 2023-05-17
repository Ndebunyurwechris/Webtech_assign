package com.coffee.service.Int;

import com.coffee.model.Customer;

public interface CustomerService {
	Customer saveUser(Customer user);
	Customer getUserById(Long id);
	Customer getUserByEmail(String email);
}
