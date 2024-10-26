package com.company.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundDto {
    String title;
    String message;
    Long productId;
}
