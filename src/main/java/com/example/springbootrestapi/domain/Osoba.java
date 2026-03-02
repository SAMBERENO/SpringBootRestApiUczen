package com.example.springbootrestapi.domain;

public abstract class Osoba {

    private String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        if(wiek < 0){
           this.wiek = 0;
        } else {
            this.wiek = wiek;
        }
    }

    public String opis() {
        return "Osoba: " + imie + ", wiek: " + wiek;
    }

    public abstract double kosztRoczny();

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

}
