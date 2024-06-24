package com.project.backend.repositories;

import com.project.backend.entities.ERole;

import java.util.Optional;

public interface RoleRepository {
    Optional<Object> findByName(ERole roleAdmin);
}
