package com.company.productservice.repositories;

import com.company.productservice.models.Category;
import com.company.productservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);

    List<Product> findAll();

    Product save(Product product);

    Optional<Product> findByTitleAndDescription(String title, String description);

    List<Product> findByTitleContaining(String title);

    List<Product> findTopThreeByTitle(String title);

    Optional<Product> findByCategory(Category category);

    void deleteById(Long id);

    void deleteByTitle(String title);

}
