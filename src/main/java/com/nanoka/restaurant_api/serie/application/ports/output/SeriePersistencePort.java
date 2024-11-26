package com.nanoka.restaurant_api.serie.application.ports.output;

import com.nanoka.restaurant_api.serie.domain.model.Serie;
import java.util.List;
import java.util.Optional;

public interface SeriePersistencePort {
    List<Serie> findAll();
    Optional<Serie> findById(Long id);
    Serie save(Serie serie);
    void deleteById(Long id);
}
