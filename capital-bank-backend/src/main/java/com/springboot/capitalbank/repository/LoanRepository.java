package com.springboot.capitalbank.repository;

import com.springboot.capitalbank.model.Accounts;
import com.springboot.capitalbank.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanRepository  extends JpaRepository<Loans, Long> {

    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
