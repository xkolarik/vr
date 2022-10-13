/*
* Copyright 2018 Iguatemi
*************************************************************
*Nome     : APIException.java
*Autor    : Builders
*Data     : 26/11/2018
*Empresa  : Platform Builders
*************************************************************
*/

package com.br.vr.exception;

import lombok.Getter;

@Getter
public abstract class APIException extends RuntimeException {

    private final ErrorMessage error;

    public APIException(final Throwable cause) {
        super(cause);
        this.error = new ErrorMessage(cause.getMessage());
    }

    public APIException(final ErrorMessage error) {
        super(error.getMessage());
        this.error = error;
    }

    public APIException(final String error) {
        super(error);
        this.error = new ErrorMessage(error);
    }

}
