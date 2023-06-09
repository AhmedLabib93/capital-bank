package com.springboot.capitalbank.service.impl;


import com.springboot.capitalbank.exception.ResourceNotFound;
import com.springboot.capitalbank.model.Customer;
import com.springboot.capitalbank.repository.CustomerRepository;
import com.springboot.capitalbank.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer registerUser(Customer customer) {
        customer.setPassword(passwordEncoder.encode(customer.getPassword()));
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    @Override
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        Customer customer = customerRepository.findByEmail(authentication.getName()).orElseThrow(()
                -> new ResourceNotFound("Email not exist " + authentication.getName()));
        return customer;
    }

}
