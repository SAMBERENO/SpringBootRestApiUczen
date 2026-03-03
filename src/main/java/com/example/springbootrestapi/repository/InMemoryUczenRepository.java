package com.example.springbootrestapi.repository;

import com.example.springbootrestapi.domain.Uczen;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class InMemoryUczenRepository implements UczenRepository{

    private Map<Long, Uczen> listaUczniow = new HashMap<>();

    public InMemoryUczenRepository() {
        Uczen uczen1 = new Uczen(1L, "Ala", 18, List.of(4,5,6));
        Uczen uczen2 = new Uczen(2L, "Jan", 12, List.of());
        listaUczniow.put(1L, uczen1);
        listaUczniow.put(2L, uczen2);
    };

    public Optional<Uczen> findById(long id) {
        return Optional.ofNullable(listaUczniow.get(id));
    }

    public Uczen save(Uczen uczen) {
        listaUczniow.put(uczen.getId(), uczen);
        return uczen;
    }

}
