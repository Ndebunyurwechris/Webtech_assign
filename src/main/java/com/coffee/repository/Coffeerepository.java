package com.coffee.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.coffee.model.CoffeeOrder;

public interface Coffeerepository extends JpaRepository<CoffeeOrder, Long> {

}
