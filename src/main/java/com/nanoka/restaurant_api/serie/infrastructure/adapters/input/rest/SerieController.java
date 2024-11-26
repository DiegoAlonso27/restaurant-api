package com.nanoka.restaurant_api.serie.infrastructure.adapters.input.rest;

import com.nanoka.restaurant_api.serie.application.ports.input.SerieServicePort;
import com.nanoka.restaurant_api.serie.domain.model.Serie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/series")
@RequiredArgsConstructor
public class SerieController {
    private final SerieServicePort serieServicePort;

    @GetMapping
    public List<Serie> getAllSeries() {
        return serieServicePort.getAllSeries();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> getSerieById(@PathVariable Long id) {
        return serieServicePort.getSerieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Serie createSerie(@RequestBody Serie serie) {
        return serieServicePort.createSerie(serie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSerie(@PathVariable Long id) {
        serieServicePort.deleteSerie(id);
        return ResponseEntity.noContent().build();
    }
}
