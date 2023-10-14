package com.example.pathfindernew.domain.viewModel;

import com.example.pathfindernew.domain.entity.PictureEntity;
import com.example.pathfindernew.domain.entity.UserEntity;
import com.example.pathfindernew.domain.entity.enums.UserLevelEnum;


import java.util.Set;

public class RouteDetailsViewModel {


    private String name;
    private UserEntity author;
    private UserLevelEnum level;
    private Set<PictureEntity> pictures;
    private String gpxCoordinates;
    private String description;
    private String videoUrl;


    public RouteDetailsViewModel() {
    }

    public UserEntity getAuthor() {
        return author;
    }

    public RouteDetailsViewModel setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteDetailsViewModel setName(String name) {
        this.name = name;
        return this;
    }


    public UserLevelEnum getLevel() {
        return level;
    }

    public RouteDetailsViewModel setLevel(UserLevelEnum level) {
        this.level = level;
        return this;
    }

    public Set<PictureEntity> getPictures() {
        return pictures;
    }

    public RouteDetailsViewModel setPictures(Set<PictureEntity> pictures) {
        this.pictures = pictures;
        return this;
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RouteDetailsViewModel setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteDetailsViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RouteDetailsViewModel setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
}
