package com.br.vr.api.impl;

import com.br.vr.api.spec.VrController;
import com.br.vr.model.request.Card;
import com.br.vr.model.response.CardResponse;
import com.br.vr.model.response.CardSaldo;
import com.br.vr.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VrControllerImpl implements VrController {

    @Autowired
    private CardService cardService;

    @Override
    @PostMapping("/cartoes")
    public CardResponse createCard(Card card) {
        return cardService.createCard(card);
    }

    @Override
    public CardSaldo getCardBalance(String numeroCartao) {
        return null;
    }
}
