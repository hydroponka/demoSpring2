package com.example.demospring2.repository;

import com.example.demospring2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    List<User> findUserByLastName(String lastName);
    User findUserByEmail(String email);
}
