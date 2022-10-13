package com.br.vr.repository;

import com.br.vr.model.request.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CardRepository extends MongoRepository<Card, String> {
    Card findCardByNumeroCartao(String numeroCartao);
    Card save(Card card);
}
