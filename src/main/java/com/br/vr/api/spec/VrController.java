package com.br.vr.api.spec;

import com.br.vr.model.request.Card;
import com.br.vr.model.response.CardResponse;
import com.br.vr.model.response.CardSaldo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Api(value = "Cartao de VR API")
public interface VrController {

    @ApiOperation(value = "Cria um novo Cartões", httpMethod = "POST")
    @ApiResponses(value = {@ApiResponse(code = 201, message = "Successful request"),
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 400, message = "Your request has invalid information or structure"),
            @ApiResponse(code = 422, message = "An business error happened")})
    @PostMapping("/cartoes")
    CardResponse createCard(Card card);


    @ApiOperation(value = "Obtem o saldo do Cartão", httpMethod = "GET")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Successful request"),
            @ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 400, message = "Your request has invalid information or structure"),
            @ApiResponse(code = 422, message = "An business error happened")})
    @GetMapping("/cartoes/{numeroCartao}")
    public CardSaldo getCardBalance(@PathVariable("numeroCartao") String numeroCartao);
}
