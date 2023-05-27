package com.coffee.controller;

import com.coffee.repository.*;
import com.coffee.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class AdminController {
    private AdminRepository adminRepository;
    @Autowired
    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }
    @RequestMapping("/admins")
    public String home(){
        // create Model attribute to bind form data
//        Admin admin = new Admin();
//        theModel.addAttribute("admin", admin);
        return "home.html";
    }

    @GetMapping("/SignUp")
    public String signUp(Model theModel){
        // create Model attribute to bind form data
        Admin admin = new Admin();
        theModel.addAttribute("admin", admin);
        return "AdminSignUp.html";
    }

    @GetMapping("/login")
    public String login(Model theModel){
        // create Model attribute to bind form data
        Admin admin = new Admin();
        theModel.addAttribute("admin", admin);
        return "login.html";
    }

    @PostMapping("/save")
    public String saveAdmin(@ModelAttribute("admin") Admin theAdmin){
        // save the Admin
        adminRepository.save(theAdmin);
        return "redirect:/admins/SignUp";
    }

    @PostMapping("/authenticate")
  //  @ResponseBody
    public String AuthenticateAdmin(@ModelAttribute("admin") Admin theAdmin){
        // Find the Admin
        List<Admin> authAdmin = adminRepository.findByEmail(theAdmin.getEmail());
        if(!authAdmin.isEmpty()){
            return "coffeeOrder";
        }
        return "redirect:/admins/SignUp";
    }
}
