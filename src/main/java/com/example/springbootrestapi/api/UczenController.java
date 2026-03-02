package com.example.springbootrestapi.api;

import com.example.springbootrestapi.api.dto.UczenResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UczenController {

    @GetMapping("/uczniowie/{id}")
    public UczenResponse

}
