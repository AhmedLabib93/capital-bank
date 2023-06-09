package com.springboot.capitalbank.service;

import com.springboot.capitalbank.model.Loans;

import java.util.List;

public interface LoanService {

    List<Loans> getLoanDetails(int id);
}
