package com.example.pathfindernew.domain.bindingModel;


import com.example.pathfindernew.domain.entity.enums.CategoryNameEnum;
import com.example.pathfindernew.domain.entity.enums.UserLevelEnum;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public class RoateAddBindingModel {

    @NotEmpty
    @Size(min = 5, max = 20, message = "Route name length must be more than 5 characters!!!!!!!!!!!!!!!!")
    private String name;
    @Size(min = 5,  message = "Description length must be more than 5 characters!!!!!!!!!!!!!!!!")
    private String description;

    private MultipartFile gpxCoordinates;

    @NotNull
    private UserLevelEnum level;

    private String videoUrl;

    private Set<CategoryNameEnum>  categories;

    public RoateAddBindingModel() {
    }

    public String getName() {
        return name;
    }

    public RoateAddBindingModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RoateAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public MultipartFile getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RoateAddBindingModel setGpxCoordinates(MultipartFile gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public UserLevelEnum getLevel() {
        return level;
    }

    public RoateAddBindingModel setLevel(UserLevelEnum level) {
        this.level = level;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RoateAddBindingModel setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public Set<CategoryNameEnum> getCategories() {
        return categories;
    }

    public RoateAddBindingModel setCategories(Set<CategoryNameEnum> categories) {
        this.categories = categories;
        return this;
    }
}
