package com.vinolemos.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinolemos.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
