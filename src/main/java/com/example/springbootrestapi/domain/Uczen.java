package com.example.springbootrestapi.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Uczen extends Osoba {

    private final long id;
    private List<Integer> oceny;

    public Uczen(String imie, int wiek, List<Integer> oceny, long id) {
        super(imie, wiek);
        this.id = id;
        this.oceny = new ArrayList<>();
        if(oceny != null) {
            for (int ocena : oceny) {
                if (ocena >= 1 && ocena <= 6) this.oceny.add(ocena);
            }
        }
    }

    public double kosztRoczny() {
        return obliczSrednia() * 100;
    }

    public void dodajOcene(int ocena) {
        if(ocena >= 1 && ocena <= 6) oceny.add(ocena);
    }

    public double obliczSrednia() {
        if (oceny.isEmpty()) return 0.0;
        return oceny.stream()
                    .collect(Collectors.averagingInt(e -> e));
    }

    @Override
    public String opis() {
        return super.opis() + ", srednia: " + String.format("%.2f", obliczSrednia());
    }

    public List<Integer> getOceny() {
        return new ArrayList<>(oceny);
    }

    public boolean maOceny(){
        return !oceny.isEmpty();
    }

    public long getId() {
        return id;
    }

}
