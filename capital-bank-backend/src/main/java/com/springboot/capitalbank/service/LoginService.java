package com.springboot.capitalbank.service;


import com.springboot.capitalbank.model.Customer;
import org.springframework.security.core.Authentication;

public interface LoginService {

    Customer registerUser(Customer customer);

    Customer getUserDetailsAfterLogin(Authentication authentication);

}
