package com.ecommerce.store.exception;

import lombok.Data;

import java.util.Date;

public @Data
class ErrorDetails {
    private int status;
    private String message;
    private long timeStamp;

    public ErrorDetails(){

    }

    public ErrorDetails(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

}
