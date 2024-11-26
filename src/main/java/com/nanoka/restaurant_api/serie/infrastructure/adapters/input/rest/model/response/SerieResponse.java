package com.nanoka.restaurant_api.serie.infrastructure.adapters.input.rest.model.response;

import com.nanoka.restaurant_api.serie.domain.model.VoucherType;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SerieResponse {
    private Long id;
    private String serie;
    private Integer correlativo;
    private VoucherType voucherType;
    private String createdAt;
    private String updatedAt;
}
