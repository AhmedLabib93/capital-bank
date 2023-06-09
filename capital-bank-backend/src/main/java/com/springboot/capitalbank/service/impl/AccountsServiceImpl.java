package com.springboot.capitalbank.service.impl;

import com.springboot.capitalbank.exception.ResourceNotFound;
import com.springboot.capitalbank.model.Accounts;
import com.springboot.capitalbank.repository.AccountsRepository;
import com.springboot.capitalbank.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public Accounts getAccountDetails(int id) {
        Accounts accounts = accountsRepository.findByCustomerId(id).orElseThrow((()
                -> new ResourceNotFound("No account found with id " + id)));
        return accounts;
    }
}
