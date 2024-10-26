package com.company.productservice.advices;

import com.company.productservice.dtos.ArithmeticExceptionDto;
import com.company.productservice.dtos.ProductNotFoundDto;
import com.company.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(ArithmeticException.class)
    public ResponseEntity<ArithmeticExceptionDto> handleArithmeticException(ArithmeticException ex) {
        ArithmeticExceptionDto arithmeticExceptionDto = new ArithmeticExceptionDto();
        arithmeticExceptionDto.setTitle("Arithmetic exception");
        arithmeticExceptionDto.setMessage(ex.getMessage());

        return new ResponseEntity<>(arithmeticExceptionDto, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundDto> handleProductNotFoundException(ProductNotFoundException ex) {
        ProductNotFoundDto productNotFoundDto = new ProductNotFoundDto();
        productNotFoundDto.setTitle("Product not found");
        productNotFoundDto.setMessage(ex.getMessage());
        productNotFoundDto.setProductId(ex.getProductId());

        return new ResponseEntity<>(productNotFoundDto, HttpStatus.NOT_FOUND);
    }
}
