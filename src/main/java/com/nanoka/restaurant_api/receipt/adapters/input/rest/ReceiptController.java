package com.nanoka.restaurant_api.receipt.adapters.input.rest;

import com.nanoka.restaurant_api.receipt.adapters.input.rest.mapper.ReceiptRestMapper;
import com.nanoka.restaurant_api.receipt.adapters.input.rest.model.response.ReceiptResponse;
import com.nanoka.restaurant_api.receipt.adapters.input.rest.model.response.ReceiptWithoutDetailResponse;
import com.nanoka.restaurant_api.receipt.application.ports.input.ReceiptServicePort;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/receipts")
@PreAuthorize("isAuthenticated()")
public class ReceiptController {
    private static final Logger logger = LoggerFactory.getLogger(ReceiptController.class);
    private final ReceiptServicePort servicePort;
    private final ReceiptRestMapper restMapper;

    @GetMapping
    public List<ReceiptWithoutDetailResponse> findAll() {
        logger.info("Obteniendo todos los recibos");
        return restMapper.toReceiptResponseListWithoutDetails(servicePort.findAll());
    }

    @GetMapping("/{id}")
    public ReceiptResponse findById(@PathVariable("id") Long id) {
        logger.info("Obteniendo recibo con id: {}", id);
        return restMapper.toReceiptResponse(servicePort.findById(id));
    }

}
