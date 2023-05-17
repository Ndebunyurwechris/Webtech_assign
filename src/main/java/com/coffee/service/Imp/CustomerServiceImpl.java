package com.coffee.service.Imp;

import org.springframework.stereotype.Service;

import com.coffee.model.Customer;
import com.coffee.repository.CustomerRepository;
import com.coffee.service.Int.*;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository cuRepository;

	public CustomerServiceImpl(CustomerRepository cuRepository) {
		super();
		this.cuRepository = cuRepository;
	}

	@Override
	public Customer saveUser(Customer user) {
	return	cuRepository.save(user);
	}

	@Override
	public Customer getUserById(Long id) {
		return cuRepository.findById(id).get();
	}
	
	@Override
	public Customer getUserByEmail(String email) {
		return cuRepository.getUserByEmail(email);
	}

}
