package com.hardcore.accounting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Accounting Service ResourceNotFountException.
 */
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFountException extends ServiceException{
    public ResourceNotFountException(String message) {
        super(message);
        this.setStatusCode(HttpStatus.NOT_FOUND.value());
        this.setErrorType(ErrorType.Clinet);
        this.setErrorCode("USER_INFO_NOT_FOUNT");
    }
}
