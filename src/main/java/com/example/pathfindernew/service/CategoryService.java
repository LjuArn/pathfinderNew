package com.example.pathfindernew.service;

import com.example.pathfindernew.domain.entity.CategoryEntity;
import com.example.pathfindernew.domain.entity.enums.CategoryNameEnum;

import java.util.Optional;

public interface CategoryService {


    CategoryEntity findCathegoryByName(CategoryNameEnum categoryNameEnum);
}
