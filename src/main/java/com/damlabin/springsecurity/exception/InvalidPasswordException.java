package com.damlabin.springsecurity.exception;

public class InvalidPasswordException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super("Mot de passe incorrect");
    }

}
