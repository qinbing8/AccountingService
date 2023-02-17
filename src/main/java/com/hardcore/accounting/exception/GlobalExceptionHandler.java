package com.hardcore.accounting.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    ResponseEntity<?> handlerServiceException(ServiceException ex) {
        ErrorResponse errorResponse = ErrorResponse.builder()
            .code(ex.getErrorCode())
            .statusCode(ex.getStatusCode())
            .errorType(ex.getErrorType())
            .message(ex.getMessage())
            .build();
        return ResponseEntity.status(ex.getStatusCode() != 0 ? ex.getStatusCode()
            : HttpStatus.INTERNAL_SERVER_ERROR.value())
            .body(errorResponse);
    }
}
