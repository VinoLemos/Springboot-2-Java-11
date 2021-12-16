package com.vinolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinolemos.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
