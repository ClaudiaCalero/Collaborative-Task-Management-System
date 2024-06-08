package com.project.backend.repositories;

import com.project.backend.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
//TaskRepository.java: Interfaz para operaciones CRUD en la entidad Task.
}
