package com.springboot.capitalbank.service.impl;

import com.springboot.capitalbank.model.Loans;
import com.springboot.capitalbank.repository.LoanRepository;
import com.springboot.capitalbank.service.LoanService;
import com.springboot.capitalbank.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public List<Loans> getLoanDetails(int id) {
        List<Loans> loans = loanRepository.findByCustomerIdOrderByStartDtDesc(id);
        return loans;
    }
}
