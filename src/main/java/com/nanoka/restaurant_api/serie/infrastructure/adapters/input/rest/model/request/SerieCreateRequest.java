package com.nanoka.restaurant_api.serie.infrastructure.adapters.input.rest.model.request;

import com.nanoka.restaurant_api.serie.domain.model.VoucherType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SerieCreateRequest {
    private String serie;
    private Integer correlativo;
    private VoucherType voucherType;
}
