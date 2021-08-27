package com.damlabin.springsecurity.web.exception;


import com.damlabin.springsecurity.utils.ErrorConstantsUtils;

public class EmailAlreadyUsedException extends BadRequestAlertException {

    private static final long serialVersionUID = 1L;

    public EmailAlreadyUsedException() {
        super(ErrorConstantsUtils.EMAIL_ALREADY_USED_TYPE, "Le courrier électronique est déjà utilisé!", "userManagement", "emailexists");
    }
}
