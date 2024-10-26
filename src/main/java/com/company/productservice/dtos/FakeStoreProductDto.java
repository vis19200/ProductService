package com.company.productservice.dtos;

import com.company.productservice.models.Category;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class FakeStoreProductDto {
    private long id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
