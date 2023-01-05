package com.pal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pal.entity.Role;

public interface RolesRepository extends JpaRepository<Role, Long> {

	Role findByName(String name);
}
