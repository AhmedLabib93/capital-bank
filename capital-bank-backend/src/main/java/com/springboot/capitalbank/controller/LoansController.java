package com.springboot.capitalbank.controller;

import com.springboot.capitalbank.model.Loans;
import com.springboot.capitalbank.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("capitalbank/v1/myLoans")
public class LoansController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/{id}")
    public List<Loans> getLoanDetails(@RequestParam int id) {
        List<Loans> loans = loanService.getLoanDetails(id);
        return loans;
    }
}
