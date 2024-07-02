package com.web_api_spring.handler;

public class RequiredFieldException extends BusinessException{
    public RequiredFieldException(String campo) {
        super("O campo %s é obrigatório", campo);
    }

}
