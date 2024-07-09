package com.dedev.organize.organizeDay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedev.organize.organizeDay.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}