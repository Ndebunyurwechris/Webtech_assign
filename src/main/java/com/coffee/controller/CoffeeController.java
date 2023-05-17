package com.coffee.controller;


import com.coffee.model.*;
import com.coffee.service.Int.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CoffeeController {

	@Autowired
	protected Coffeeservice coffservice;
	@Autowired
	protected CustomerService custService;
	


	@GetMapping("/getorder")
    public String listOrders(Model theModel){
        List<CoffeeOrder> Cofe = coffservice.getAllorder();
        theModel.addAttribute("coffeeOrders",Cofe);
		return "coffeeOrder";
	}

	@GetMapping("/CoffeeOrder/new")
	public String createcoffForm(Model model) {

		// create student object to hold student form data
		CoffeeOrder coff = new CoffeeOrder();
		model.addAttribute("CoffeeOrder", coff);
		return "create_order";
	}
	

	
	

	@PostMapping("/customer/save")
	public String save(@RequestParam("user.quantity") String quant,
					   @RequestParam("user.email") String email,
					   @RequestParam("user.name") String name,
					   @RequestParam("Id") Long OrderId) {
		
		Customer cst = custService.getUserByEmail(email);
			cst = new Customer();
			cst.setName(name);
			cst.setEmail(email);
			cst.setQuant(quant);
			custService.saveUser(cst);
	


		return "redirect:/getorder";
	}


	@PostMapping("/CoffeeOrder/coffee")
	public String saveOrder(@ModelAttribute("CoffeeOrder") CoffeeOrder b) {
		coffservice.saveOrder(b);
		return "redirect:/getorder";
	}

	@GetMapping("/coffeeOrder/edit/{id}")
	public String editForm(@PathVariable Long id, Model model) {
		model.addAttribute("CoffeeOrder", coffservice.getById(id));
		return "edit_order";
	}

	@PostMapping("/CoffeeOrder/{id}")
	public String updateOrder(@PathVariable Long id,
							 @ModelAttribute("CoffeeOrder") CoffeeOrder cof,
							 Model model) {

	
		CoffeeOrder existing = coffservice.getById(id);
		existing.setId(id);
		existing.setName(cof.getName());
		existing.setOrderer(cof.getOrderer());
		existing.setPrice(cof.getPrice());
		existing.setPublicationdate(cof.getPublicationdate());
		existing.setQuantity(cof.getQuantity());
		existing.setExports_or_imports(cof.getExports_or_imports());

		// save updated student object
		coffservice.updateOrder(existing);
		return "redirect:/getorder";
	}

	@GetMapping("/CoffeeOrder/{id}")
	public String deleteOrder(@PathVariable Long id) {
		coffservice.deleteById(id);
		return "redirect:/getorder";
	}

}
