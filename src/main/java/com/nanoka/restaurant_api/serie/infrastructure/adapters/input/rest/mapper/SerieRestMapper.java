package com.nanoka.restaurant_api.serie.infrastructure.adapters.input.rest.mapper;

import com.nanoka.restaurant_api.serie.domain.model.Serie;
import com.nanoka.restaurant_api.serie.infrastructure.adapters.input.rest.dto.SerieDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SerieRestMapper {
    SerieRestMapper INSTANCE = Mappers.getMapper(SerieRestMapper.class);

    SerieDto toDto(Serie serie);
    Serie toEntity(SerieDto serieDto);
}
