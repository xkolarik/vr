package com.br.vr.service;

import com.br.vr.model.request.Card;
import com.br.vr.model.request.Transaction;
import com.br.vr.model.response.CardResponse;

public interface CardService {
    CardResponse createCard(Card card);
    Card findCardByNumberCard(String numeroCartao);
    Transaction transaction(Transaction transaction);
}
