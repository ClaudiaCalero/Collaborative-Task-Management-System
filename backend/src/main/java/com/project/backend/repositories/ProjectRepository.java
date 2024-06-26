package com.project.backend.repositories;

import com.project.backend.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    //ProjectRepository.java: Interfaz para operaciones CRUD en la entidad Project.
}
