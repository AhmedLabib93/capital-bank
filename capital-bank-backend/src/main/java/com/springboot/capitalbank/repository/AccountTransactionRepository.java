package com.springboot.capitalbank.repository;

import com.springboot.capitalbank.model.AccountTransactions;
import com.springboot.capitalbank.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountTransactionRepository  extends JpaRepository<AccountTransactions, String> {

    List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
