package com.project.backend.repositories;

import com.project.backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUsername(String username);

    boolean existsByEmail(Object email);
//UserRepository.java: Interfaz para operaciones CRUD en la entidad User.
}
