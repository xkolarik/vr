package com.br.vr.mapper;

import com.br.vr.model.request.Card;
import com.br.vr.model.response.CardResponse;

public interface CardMapper {

    Card cardToCardResponse(CardResponse cardResponse);
    CardResponse cardResponseToCard(Card card);

}
