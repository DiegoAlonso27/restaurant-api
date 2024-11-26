package com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.mapper;

import com.nanoka.restaurant_api.serie.domain.model.Serie;
import com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.entity.SerieEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeriePersistenceMapper {
    SeriePersistenceMapper INSTANCE = Mappers.getMapper(SeriePersistenceMapper.class);

    SerieEntity toSeriesEntity(Serie serie);
    Serie toSeries(SerieEntity entity);
    List<Serie> toSeriesList(List<SerieEntity> seriesList);
}