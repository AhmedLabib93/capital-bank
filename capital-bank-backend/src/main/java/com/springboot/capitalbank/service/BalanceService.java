package com.springboot.capitalbank.service;

import com.springboot.capitalbank.model.AccountTransactions;

import java.util.List;

public interface BalanceService {

    List<AccountTransactions> getBalanceDetails(int id);
}
