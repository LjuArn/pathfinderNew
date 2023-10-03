package com.example.pathfindernew.domain.entity;

import com.example.pathfindernew.domain.entity.BaseEntity;
import com.example.pathfindernew.domain.entity.enums.CategoryNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private CategoryNameEnum name;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    public CategoryEntity() {
    }

    public CategoryNameEnum getName() {
        return name;
    }

    public CategoryEntity setName(CategoryNameEnum name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CategoryEntity setDescription(String description) {
        this.description = description;
        return this;
    }
}


//•	name - Accepts String values (PEDESTRIAN, BICYCLE, MOTORCYCLE, CAR)
//•	description - Accepts very long String values