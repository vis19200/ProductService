package com.company.productservice;

import com.company.productservice.models.Category;
import com.company.productservice.models.Product;
import com.company.productservice.repositories.CategoryRepository;
import com.company.productservice.repositories.ProductRepository;
import com.company.productservice.repositories.projections.ProductWithIdAndTitle;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class ProductServiceApplicationTests {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Test
    void contextLoads() {
    }

    @Test
    @Transactional
    public void testQueries() {
//        List<Product> products = productRepository.someRandomQuery();
//        System.out.println("DEBUG");

//        ProductWithIdAndTitle product = productRepository.someRandomQuery(2L);
//        System.out.println("DEBUG");

//        ProductWithIdAndTitle product = productRepository.someRandomQuerySql(2L);
//        System.out.println("DEBUG");

//        Optional<Product> optionalProduct = productRepository.findById(2L);
//        Product product = null;
//        if(optionalProduct.isPresent()) {
//            product = optionalProduct.get();
//        }
//        System.out.println("DEBUG");

        Optional<Category> optionalCategory = categoryRepository.findById(1L);
        Category category = null;
        if(optionalCategory.isPresent()) {
            category = optionalCategory.get();
        }

        List<Product> products = category.getProducts();
        System.out.println("DEBUG");
        products.forEach(product -> System.out.println(product.getTitle()));

    }

}
