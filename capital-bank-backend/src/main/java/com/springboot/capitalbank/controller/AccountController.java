package com.springboot.capitalbank.controller;

import com.springboot.capitalbank.model.Accounts;
import com.springboot.capitalbank.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("capitalbank/v1")
public class AccountController {

    @Autowired
    private AccountsService accountsService;

    @GetMapping("/myAccount/{id}")
    public Accounts getAccountDetails(@RequestParam int id) {
        return accountsService.getAccountDetails(id);
    }
}
