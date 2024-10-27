package com.company.productservice.repositories;

import com.company.productservice.models.Category;
import com.company.productservice.models.Product;
import com.company.productservice.repositories.projections.ProductWithIdAndTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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


    @Query("select p from Product p where p.price > 500")
    List<Product> someRandomQuery();

    @Query("select p.id as id, p.title as title from Product p where p.id = :id")
    ProductWithIdAndTitle someRandomQuery(@Param("id") Long id);

    @Query(value = "select id, title from products p where p.id = :id", nativeQuery = true)
    ProductWithIdAndTitle someRandomQuerySql(@Param("id") Long id);

}
