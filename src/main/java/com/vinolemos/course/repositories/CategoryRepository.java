package com.vinolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinolemos.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
