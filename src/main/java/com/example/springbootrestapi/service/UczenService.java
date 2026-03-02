package com.example.springbootrestapi.service;

import com.example.springbootrestapi.api.dto.UczenResponse;
import com.example.springbootrestapi.domain.Uczen;
import com.example.springbootrestapi.repository.UczenRepository;

public class UczenService {

    private final UczenRepository uczenRepository;

    public UczenService(UczenRepository uczenRepository) {
        this.uczenRepository = uczenRepository;
    }

    public UczenResponse getUczen(long id){
        Uczen uczen = uczenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nie znaleziono ucznia o id: " + id));
                return UczenMapper.toResponse(uczen);
    }

    public void dodajOcene(long id, int ocena){
        Uczen uczen = uczenRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Nie znaleziono ucznia o id: " + id));
        uczen.dodajOcene(ocena);
        uczenRepository.save(uczen);
    }
}
