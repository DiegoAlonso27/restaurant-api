package com.nanoka.restaurant_api.product.infrastructure.adapters.input.rest;

import com.nanoka.restaurant_api.product.application.ports.input.ProductServicePort;
import com.nanoka.restaurant_api.product.infrastructure.adapters.input.rest.mapper.ProductRestMapper;
import com.nanoka.restaurant_api.product.infrastructure.adapters.input.rest.model.request.ProductCreateRequest;
import com.nanoka.restaurant_api.product.infrastructure.adapters.input.rest.model.response.ProductResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
@PreAuthorize("isAuthenticated()")
public class ProductController {
    private final ProductServicePort servicePort;
    private final ProductRestMapper restMapper;

    @GetMapping
    public List<ProductResponse> findAll() {
        return restMapper.toProductResponseList(servicePort.findAll(false));
    }

    @GetMapping("/{id}")
    public ProductResponse findById(@PathVariable("id") Long id) {
        return  restMapper.toProductResponse(servicePort.findById(id));
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<ProductResponse> save(@Valid @RequestBody ProductCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(restMapper.toProductResponse(
                        servicePort.save(restMapper.toProduct(request),false)));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ProductResponse update(@PathVariable Long id, @Valid @RequestBody ProductCreateRequest request) {
        return restMapper.toProductResponse(
                servicePort.update(id, restMapper.toProduct(request)));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void delete(@PathVariable Long id) {
        servicePort.delete(id);
    }
}