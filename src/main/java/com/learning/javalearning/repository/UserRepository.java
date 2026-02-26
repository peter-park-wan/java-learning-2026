package com.learning.javalearning.repository;

import com.learning.javalearning.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}