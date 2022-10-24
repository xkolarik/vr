package com.br.vr.model.request;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Conta")
public class Conta {

    private String nmClient;
    private Double saldo;
}
