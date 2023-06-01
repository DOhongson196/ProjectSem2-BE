package com.nosz.projectsem2be.respository;

import com.nosz.projectsem2be.entity.Category;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    List<Category> findByNameStartsWith(String name, Pageable pageable);

    List<Category> findByNameContainsIgnoreCase(String name);



}