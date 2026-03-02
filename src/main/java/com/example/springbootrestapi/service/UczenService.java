package com.example.springbootrestapi.service;

import com.example.springbootrestapi.api.dto.UczenResponse;
import com.example.springbootrestapi.domain.Uczen;
import com.example.springbootrestapi.domain.exceptions.UczenNotFoundException;
import com.example.springbootrestapi.repository.UczenRepository;
import org.springframework.stereotype.Service;

@Service
public class UczenService {

    private final UczenRepository uczenRepository;

    public UczenService(UczenRepository uczenRepository) {
        this.uczenRepository = uczenRepository;
    }

    public static UczenResponse getUczenMap(Uczen uczen){
        return new UczenResponse(uczen.getImie(), uczen.getWiek(), uczen.obliczSrednia());
    }

    public UczenResponse getUczen(long id){
        UczenResponse uczenResponse;
        uczenResponse = uczenRepository.findById(id)
                .map(UczenService::getUczenMap)
                .orElseThrow(() -> new UczenNotFoundException(id));
        return uczenResponse;
    }

    public void dodajOcene(long id, int ocena){
        Uczen uczen = uczenRepository.findById(id)
                .orElseThrow(() -> new UczenNotFoundException(id));
            uczen.dodajOcene(ocena);
            uczenRepository.save(uczen);
    }
}
