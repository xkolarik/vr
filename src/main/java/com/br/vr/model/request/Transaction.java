package com.br.vr.model.request;

import lombok.Data;

@Data
public class Transaction {

    private Card card;
    private Double value;

}
