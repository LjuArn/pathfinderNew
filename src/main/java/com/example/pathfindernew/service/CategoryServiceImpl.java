package com.example.pathfindernew.service;


import com.example.pathfindernew.domain.entity.CategoryEntity;
import com.example.pathfindernew.domain.entity.enums.CategoryNameEnum;
import com.example.pathfindernew.repository.CategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryEntity findCathegoryByName(CategoryNameEnum categoryNameEnum) {
        return categoryRepository.findByName(categoryNameEnum).orElse(null);
    }
}
