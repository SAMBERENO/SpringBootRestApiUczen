package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.domain.Uczen;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryUczenRepository implements UczenRepository{

    InMemoryUczenRepository() {};

    private Map<Long, Uczen> listaUczniow = new HashMap<>();

    public Optional<Uczen> findById(long id) {
        return Optional.ofNullable(listaUczniow.get(id));
    }

    public Uczen save(Uczen uczen) {
        listaUczniow.put(uczen.getId(), uczen);
        return uczen;
    }

}
