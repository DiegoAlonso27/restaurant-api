
package com.nanoka.restaurant_api.serie.domain.model;

public enum VoucherType {
    BOLETA("03"), FACTURA("01");

    private final String id;

    VoucherType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}