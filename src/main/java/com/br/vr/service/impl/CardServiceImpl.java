package com.br.vr.service.impl;

import com.br.vr.model.request.Card;
import com.br.vr.model.response.CardResponse;
import com.br.vr.service.CardService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class CardServiceImpl implements CardService {

    @Override
    public CardResponse createCard(Card card) {
        return null;
    }
}
