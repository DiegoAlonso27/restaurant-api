package com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.repository;

import com.nanoka.restaurant_api.serie.infrastructure.adapters.output.persistence.entity.SerieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<SerieEntity, Long> {
}
