package com.nanoka.restaurant_api.serie.domain.model;

import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Serie {
    private Long id;
    private String serie;
    private Integer correlativo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private VoucherType voucherType;
}
