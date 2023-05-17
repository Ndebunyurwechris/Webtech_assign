package com.coffee.service.Imp;


import java.util.List;

import org.springframework.stereotype.Service;

import com.coffee.model.CoffeeOrder;
import com.coffee.repository.Coffeerepository;
import com.coffee.service.Int.Coffeeservice;

@Service
public class Coffeeserviceimpl implements Coffeeservice {
    
	private Coffeerepository repository;
    
	
	

	public Coffeeserviceimpl(Coffeerepository repository) {
		super();
		this.repository = repository;
	}


	

	@Override
	public List<CoffeeOrder> getAllorder() {
	
		return repository.findAll();
	}




	@Override
	public CoffeeOrder saveOrder(CoffeeOrder Co) {
		// TODO Auto-generated method stub
		return repository.save(Co);
	}




	@Override
	public CoffeeOrder getById(Long id) {
		
		return repository.findById(id).get();
	}




	@Override
	public CoffeeOrder updateOrder(CoffeeOrder Co) {
		
		return repository.save(Co);
	}




	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
		
	}
	





	 
}
