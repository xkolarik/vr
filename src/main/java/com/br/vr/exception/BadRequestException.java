/*
* Copyright 2018 Iguatemi
*************************************************************
*Nome     : BadRequestException.java
*Autor    : Builders
*Data     : 26/11/2018
*Empresa  : Platform Builders
*************************************************************
*/

package com.br.vr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends APIException {

    public BadRequestException(final Throwable cause) {
        super(cause);
    }

    public BadRequestException(final ErrorMessage error) {
        super(error);
    }

    public BadRequestException(final String error) {
        super(error);
    }

}
