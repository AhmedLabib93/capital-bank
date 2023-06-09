package com.springboot.capitalbank.exception;

import org.springframework.http.HttpStatus;

public class CapitalBankAPIException extends RuntimeException {

    private HttpStatus status;

    public CapitalBankAPIException(HttpStatus status, String message) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
    
}
