package com.dedev.organize.organizeDay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dedev.organize.organizeDay.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}