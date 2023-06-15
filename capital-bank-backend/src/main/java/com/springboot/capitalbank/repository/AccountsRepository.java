package com.springboot.capitalbank.repository;

import com.springboot.capitalbank.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountsRepository extends JpaRepository<Accounts, Integer> {

    Optional<Accounts> findByCustomerId(int customerId);
}
