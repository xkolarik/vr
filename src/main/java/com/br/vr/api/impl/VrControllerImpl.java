package com.br.vr.api.impl;

import com.br.vr.api.spec.VrController;
import com.br.vr.model.request.Card;
import com.br.vr.model.request.Transaction;
import com.br.vr.model.response.CardResponse;
import com.br.vr.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VrControllerImpl implements VrController {

    @Autowired
    private CardService cardService;

    @Override
    public CardResponse createCard(Card card) {
        CardResponse response =  cardService.createCard(card);
        return response;
    }

    @Override
    public Card getCardBalance(String numeroCartao) {
        return cardService.findCardByNumberCard(numeroCartao);
    }

    @Override
    public Transaction transaction(Transaction transaction) {
        return cardService.transaction(transaction);
    }
}
