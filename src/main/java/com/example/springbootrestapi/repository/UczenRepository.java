package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.domain.Uczen;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UczenRepository {
    Optional<Uczen> findById(long id);
    Uczen save(Uczen uczen);
}
