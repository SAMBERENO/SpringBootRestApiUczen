package com.example.springbootrestapi.api;

import com.example.springbootrestapi.api.dto.DodajOceneRequest;
import com.example.springbootrestapi.api.dto.UczenResponse;
import com.example.springbootrestapi.domain.exceptions.NiepoprawnaOcenaException;
import com.example.springbootrestapi.domain.exceptions.UczenNotFoundException;
import com.example.springbootrestapi.service.UczenService;
import org.springframework.web.bind.annotation.*;

@RestController
public class UczenController {

    private final UczenService uczenService;

    public UczenController(UczenService uczenService) {
        this.uczenService = uczenService;
    }

    @GetMapping("/uczniowie/{id}")
    public UczenResponse getUczen(@PathVariable long id){
        return uczenService.getUczen(id);
    }

    @GetMapping("/ping")
    public String ping(){
        return "pong";
    }

    @PostMapping("/uczniowie/{id}/oceny")
    public void dodajOcene(@PathVariable long id, @RequestBody DodajOceneRequest request){
            uczenService.dodajOcene(id, request.ocena());
    }

}
