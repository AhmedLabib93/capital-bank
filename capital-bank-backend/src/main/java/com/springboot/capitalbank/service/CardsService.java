package com.springboot.capitalbank.service;

import com.springboot.capitalbank.model.Cards;

import java.util.List;


public interface CardsService {

    List<Cards> getCardDetails(int id);
}
