package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.domain.Uczen;

import java.util.Optional;

public interface UczenRepository {
    Optional<Uczen> findById(Long id);
    Uczen save(Uczen uczen);
}
