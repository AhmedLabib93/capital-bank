package com.springboot.capitalbank.service.impl;

import com.springboot.capitalbank.model.Cards;
import com.springboot.capitalbank.repository.CardsRepository;
import com.springboot.capitalbank.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardsServiceImpl implements CardsService {

    @Autowired
    private CardsRepository cardsRepository;

    public List<Cards> getCardDetails(int id) {
        List<Cards> cards = cardsRepository.findByCustomerId(id);
        return cards;
    }
}
