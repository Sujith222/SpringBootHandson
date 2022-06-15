package com.springrest.food.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity foodExceptionHandler(Exception e) {
        System.out.println("inside the foodexceptionhandler");
        ResponseEntity rs = new ResponseEntity("Food exception " + e.getMessage(), HttpStatus.NOT_FOUND);
        return rs;
    }

}
