package com.example.springbootrestapi.domain.exceptions;

public class NiepoprawnaOcenaException extends RuntimeException{
    public NiepoprawnaOcenaException(String message){
        super("Niepoprawna ocena: " + message);
    }
}
