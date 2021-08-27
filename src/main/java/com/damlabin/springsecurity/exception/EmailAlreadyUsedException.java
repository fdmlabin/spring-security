package com.damlabin.springsecurity.exception;

public class EmailAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmailAlreadyUsedException() {
        super("Le courrier électronique est déjà utilisé !");
    }

}
