package com.br.vr.service;

import com.br.vr.model.request.Card;
import com.br.vr.model.response.CardResponse;

public interface CardService {
    CardResponse createCard(Card card);
}
