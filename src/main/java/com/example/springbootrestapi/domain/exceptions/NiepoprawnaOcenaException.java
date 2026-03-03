package com.example.springbootrestapi.domain.exceptions;

public class NiepoprawnaOcenaException extends RuntimeException{
    public NiepoprawnaOcenaException(int ocena){
        super("Niepoprawna ocena: " + ocena);
    }
}
