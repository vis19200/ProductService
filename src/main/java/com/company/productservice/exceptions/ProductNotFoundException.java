package com.company.productservice.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundException extends Exception {
    Long productId;
    public ProductNotFoundException(Long productId, String message) {
        super(message);
        this.productId = productId;
    }
}
