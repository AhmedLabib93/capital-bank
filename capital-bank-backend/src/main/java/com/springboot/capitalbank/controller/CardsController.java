package com.springboot.capitalbank.controller;

import com.springboot.capitalbank.model.Cards;
import com.springboot.capitalbank.service.CardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("capitalbank/v1/myCards")
public class CardsController {

    @Autowired
    private CardsService cardsService;

    @GetMapping("/{id}")
    public List<Cards> getCardDetails(@RequestParam int id) {
        List<Cards> cards = cardsService.getCardDetails(id);
        return cards;
    }
}
