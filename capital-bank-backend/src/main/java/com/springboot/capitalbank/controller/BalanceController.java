package com.springboot.capitalbank.controller;

import com.springboot.capitalbank.model.AccountTransactions;
import com.springboot.capitalbank.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("capitalbank/v1")
public class BalanceController {

    @Autowired
    private BalanceService  balanceService;

    @GetMapping("/myBalance/{id}")
    public List<AccountTransactions> getBalanceDetails(@RequestParam int id) {
        List<AccountTransactions> accountTransactions = balanceService.getBalanceDetails(id);
        return accountTransactions;
    }
}
