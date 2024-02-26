package com.example.spring.product.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.product.Entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{

}
