package com.naveen.jobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.jobs.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}