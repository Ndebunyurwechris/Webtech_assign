package com.coffee.service.Int;


import java.util.List;

import com.coffee.model.CoffeeOrder;

public interface Coffeeservice {
   List<CoffeeOrder> getAllorder();
   CoffeeOrder saveOrder(CoffeeOrder Co);
   
   CoffeeOrder getById(Long id);
	
	CoffeeOrder updateOrder(CoffeeOrder Co);
	
	void deleteById(Long id);
   
}
