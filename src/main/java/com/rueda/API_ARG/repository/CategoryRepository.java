package com.rueda.API_ARG.repository;

import com.rueda.API_ARG.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
