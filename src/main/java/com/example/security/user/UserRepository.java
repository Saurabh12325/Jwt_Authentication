package com.example.security.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {


    static Optional<User> findByEmail(String email) {
        return null;
    }
}
