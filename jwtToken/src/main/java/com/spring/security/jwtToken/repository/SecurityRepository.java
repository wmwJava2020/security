package com.spring.security.jwtToken.repository;

import com.spring.security.jwtToken.entity.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SecurityRepository extends JpaRepository<SecurityRepository, Integer> {
    Optional<SecurityUser> findByEmail(String email);
}
