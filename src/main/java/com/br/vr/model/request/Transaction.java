package com.br.vr.model.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Transaction")
public class Transaction {

    private Card card;
    private Double value;

}
