package com.pal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pal.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}
