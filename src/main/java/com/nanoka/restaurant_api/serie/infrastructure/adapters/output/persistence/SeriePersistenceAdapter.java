package com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence;

import com.nanoka.restaurant_api.serie.application.ports.output.SeriePersistencePort;
import com.nanoka.restaurant_api.serie.domain.model.Serie;
import com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.entity.SerieEntity;
import com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.mapper.SeriePersistenceMapper;
import com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.repository.SerieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class SeriePersistenceAdapter implements SeriePersistencePort {
    private final SerieRepository serieRepository;
    private final SeriePersistenceMapper mapper;

    @Override
    public List<Serie> findAll() {
        List<SerieEntity> entities = serieRepository.findAll();
        return mapper.toSeriesList(entities);
    }

    @Override
    public Optional<Serie> findById(Long id) {
        Optional<SerieEntity> entity = serieRepository.findById(id);
        return entity.map(mapper::toSeries);
    }

    @Override
    public Serie save(Serie serie) {
        SerieEntity entity = mapper.toSeriesEntity(serie);
        SerieEntity savedEntity = serieRepository.save(entity);
        return mapper.toSeries(savedEntity);
    }

    @Override
    public void deleteById(Long id) {
        serieRepository.deleteById(id);
    }
}
