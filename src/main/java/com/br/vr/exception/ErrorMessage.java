/*
 * Copyright 2018 Iguatemi
 *************************************************************
 *Nome     : ErrorMessage.java
 *Autor    : Builders
 *Data     : 26/11/2018
 *Empresa  : Platform Builders
 *************************************************************
 */

package com.br.vr.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@JsonInclude(Include.NON_EMPTY)
public class ErrorMessage implements Serializable {

    private String message;

    private String link;

    private List<Error> errors = new ArrayList<>();

    public ErrorMessage(final String msg) {

        this.message = msg;
    }

    public ErrorMessage(final String msg, final String link) {

        this.message = msg;
        this.link = link;
    }

    public ErrorMessage(final String msg, final List<Error> errors) {

        this.message = msg;
        this.errors = errors;
    }

    public ErrorMessage(final String msg, final List<Error> errors, final String link) {

        this.message = msg;
        this.errors = errors;
        this.link = link;
    }

    public void addError(final Error error) {

        errors.add(error);
    }

}
