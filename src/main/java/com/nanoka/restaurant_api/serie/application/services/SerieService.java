package com.nanoka.restaurant_api.serie.application.services;

import com.nanoka.restaurant_api.serie.application.ports.input.SerieServicePort;
import com.nanoka.restaurant_api.serie.application.ports.output.SeriePersistencePort;
import com.nanoka.restaurant_api.serie.domain.model.Serie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SerieService implements SerieServicePort {
    private final SeriePersistencePort seriePersistencePort;

    @Override
    public List<Serie> getAllSeries() {
        return seriePersistencePort.findAll();
    }

    @Override
    public Optional<Serie> getSerieById(Long id) {
        return seriePersistencePort.findById(id);
    }

    @Override
    public Serie createSerie(Serie serie) {
        return seriePersistencePort.save(serie);
    }

    @Override
    public void deleteSerie(Long id) {
        seriePersistencePort.deleteById(id);
    }
}
