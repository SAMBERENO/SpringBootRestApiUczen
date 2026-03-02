package com.example.springbootrestapi.domain.exceptions;

public class UczenNotFoundException extends RuntimeException{
    public UczenNotFoundException(long id){
        super("Nie znaleziono ucznia o id: " + id);
    }
}
