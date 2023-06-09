package com.springboot.capitalbank.repository;

import com.springboot.capitalbank.model.Accounts;
import com.springboot.capitalbank.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository  extends JpaRepository<Cards, Long> {

    List<Cards> findByCustomerId(int customerId);

}
