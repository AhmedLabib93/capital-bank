package com.springboot.capitalbank.service.impl;

import com.springboot.capitalbank.model.AccountTransactions;
import com.springboot.capitalbank.repository.AccountTransactionRepository;
import com.springboot.capitalbank.service.BalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BalanceServiceImpl implements BalanceService {

    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    @Override
    public List<AccountTransactions> getBalanceDetails(int id) {
        List<AccountTransactions> accountTransactions = accountTransactionRepository.
                findByCustomerIdOrderByTransactionDtDesc(id);
        return accountTransactions;
    }
}
