package com.example.springbootrestapi.api.dto;

import java.util.List;

public record UczenResponse(
        String imie,
        int wiek,
        List<Integer> oceny,
        double srednia
) {
}
