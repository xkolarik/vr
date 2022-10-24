package com.br.vr.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@Document(collection = "Card")
public class Card {

    private String numeroCartao;
    private String senha;
    private Conta conta;
}
