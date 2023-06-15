package com.springboot.capitalbank.controller;

import com.springboot.capitalbank.model.Customer;
import com.springboot.capitalbank.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/capitalbank/v1")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/register")
    public ResponseEntity<Customer> registerUser(@RequestBody Customer customer){
        Customer savedCustomer = loginService.registerUser(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @GetMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        Customer customer = loginService.getUserDetailsAfterLogin(authentication);
        return customer;
    }
}
