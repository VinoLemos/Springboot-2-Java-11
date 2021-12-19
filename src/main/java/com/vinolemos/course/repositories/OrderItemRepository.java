package com.vinolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinolemos.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
