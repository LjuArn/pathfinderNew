package com.example.pathfindernew.domain.serviceModel;

import com.example.pathfindernew.domain.entity.CategoryEntity;
import com.example.pathfindernew.domain.entity.CommentEntity;
import com.example.pathfindernew.domain.entity.PictureEntity;
import com.example.pathfindernew.domain.entity.UserEntity;
import com.example.pathfindernew.domain.entity.enums.CategoryNameEnum;
import com.example.pathfindernew.domain.entity.enums.UserLevelEnum;

import java.util.Set;

public class RouteServiceModel {

    private Long id;
    private String gpxCoordinates;
    private String description;
    private UserLevelEnum level;
    private String name;
    private String videoUrl;
    private UserEntity author;
    private Set<CategoryNameEnum> categories;
    private Set<PictureEntity> pictures;
    private Set<CommentEntity> comments;

    public RouteServiceModel() {
    }

    public Long getId() {
        return id;
    }

    public RouteServiceModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RouteServiceModel setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public UserLevelEnum getLevel() {
        return level;
    }

    public RouteServiceModel setLevel(UserLevelEnum level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteServiceModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RouteServiceModel setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public RouteServiceModel setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public Set<CategoryNameEnum> getCategories() {
        return categories;
    }

    public RouteServiceModel setCategories(Set<CategoryNameEnum> categories) {
        this.categories = categories;
        return this;
    }

    public Set<PictureEntity> getPictures() {
        return pictures;
    }

    public RouteServiceModel setPictures(Set<PictureEntity> pictures) {
        this.pictures = pictures;
        return this;
    }

    public Set<CommentEntity> getComments() {
        return comments;
    }

    public RouteServiceModel setComments(Set<CommentEntity> comments) {
        this.comments = comments;
        return this;
    }
}
