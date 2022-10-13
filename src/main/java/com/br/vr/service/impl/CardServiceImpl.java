package com.br.vr.service.impl;

import com.br.vr.exception.BadRequestException;
import com.br.vr.model.request.Card;
import com.br.vr.model.request.Transaction;
import com.br.vr.model.response.CardResponse;
import com.br.vr.repository.CardRepository;
import com.br.vr.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Service
@Lazy
@Slf4j
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public CardResponse createCard(Card card) {
        log.info("[m=patchCard] - Verificando se numeroCartao existe ...");
        if ( StringUtils.isEmpty(card.getNumeroCartao()) &&
            mongoTemplate.exists(new Query(where("numeroCartao").is(card.getNumeroCartao())), Card.class)){

                throw new BadRequestException("Telefone já cadastrado");
        }

        Card response = cardRepository.save(card);

        CardResponse cardResponse = new CardResponse();
        cardResponse.setNumeroCartao(response.getNumeroCartao());

        return cardResponse;
    }

    @Override
    public Card findCardByNumberCard(String numeroCartao) {
        return cardRepository.findCardByNumeroCartao(numeroCartao);
    }

    //Dados de cartões geralmente são tratados por empresas que detem os dados de cartões de clientes, por segurança e lei LGPD.
    //Provavelmente deveria existir um serviço onde será feito as tratativas de uma conta de um cliente para determinado cartão
    @Override
    public Transaction transaction(Transaction transaction) {
        var number = transaction.getCard().getNumeroCartao();
        Card card = cardRepository.findCardByNumeroCartao(number);

        Transaction transaction1 = new Transaction();
        transaction1.setCard(cardRepository.save(card));

        return transaction1;
    }
}
