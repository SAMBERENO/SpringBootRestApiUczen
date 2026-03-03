package com.example.springbootrestapi.api;

import com.example.springbootrestapi.api.dto.ErrorResponse;
import com.example.springbootrestapi.domain.exceptions.NiepoprawnaOcenaException;
import com.example.springbootrestapi.domain.exceptions.UczenNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler{

    @ExceptionHandler(UczenNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleUczenNotFoundException(UczenNotFoundException e){
        return new ErrorResponse(e.getMessage());
    }

    @ExceptionHandler(NiepoprawnaOcenaException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleNiepoprawnaOcenaException(NiepoprawnaOcenaException e){
        return new ErrorResponse(e.getMessage());
    }

}
