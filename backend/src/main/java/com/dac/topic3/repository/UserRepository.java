package com.dac.topic3.repository;

import com.dac.topic3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
    List<User> findAll();

    List<User> getByStatus(String status);
}
