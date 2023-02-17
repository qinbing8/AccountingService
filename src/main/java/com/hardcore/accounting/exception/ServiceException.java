package com.hardcore.accounting.exception;

import lombok.Data;

/**
 * Accounting Service Exception.
 */
@Data
public class ServiceException extends RuntimeException{
    private int statusCode;
    private String errorCode; // biz error code
    private ServiceException.ErrorType errorType; // Service, Clicent, Unknow

    public enum ErrorType{
        Clinet,
        Service,
        Unknow
    }

    public ServiceException(String message) {
        super(message);
    }
}
