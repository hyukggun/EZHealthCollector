package com.hyukggun.EZHealthCollector.repository;

import com.hyukggun.EZHealthCollector.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    
} 
