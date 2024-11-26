package com.nanoka.restaurant_api.serie.application.ports.input;

import com.nanoka.restaurant_api.serie.domain.model.Serie;
import java.util.List;
import java.util.Optional;

public interface SerieServicePort {
    List<Serie> getAllSeries();
    Optional<Serie> getSerieById(Long id);
    Serie createSerie(Serie serie);
    void deleteSerie(Long id);
}
