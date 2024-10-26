package com.company.productservice.services;

import com.company.productservice.dtos.FakeStoreProductDto;
import com.company.productservice.exceptions.ProductNotFoundException;
import com.company.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    Product replaceProduct(Long id, FakeStoreProductDto productDto);

    void deleteProduct(Long id);
}
