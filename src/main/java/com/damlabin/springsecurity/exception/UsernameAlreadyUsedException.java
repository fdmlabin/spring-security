package com.damlabin.springsecurity.exception;

public class UsernameAlreadyUsedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UsernameAlreadyUsedException() {
        super("Nom de connexion déjà utilisé !");
    }

}
