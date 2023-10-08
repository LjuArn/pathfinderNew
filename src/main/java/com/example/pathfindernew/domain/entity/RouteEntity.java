package com.example.pathfindernew.domain.entity;

import com.example.pathfindernew.domain.entity.enums.UserLevelEnum;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "routes")
public class RouteEntity extends BaseEntity{

    @Column(name = "gpx_coordinates", columnDefinition = "LONGTEXT")
    private String gpxCoordinates;
    @Column(columnDefinition = "TEXT")
    private String description;
    @Column
    @Enumerated(EnumType.STRING)
    private UserLevelEnum level;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(name = "video_url")
    private String videoUrl;
    @ManyToOne
    private UserEntity author;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<CategoryEntity> categories;

    @OneToMany(mappedBy = "route", fetch = FetchType.EAGER)
    private Set<PictureEntity> pictures;

    @OneToMany(mappedBy = "route", fetch = FetchType.EAGER)
    private Set<CommentEntity> comments;

    public RouteEntity() {
    }

    public String getGpxCoordinates() {
        return gpxCoordinates;
    }

    public RouteEntity setGpxCoordinates(String gpxCoordinates) {
        this.gpxCoordinates = gpxCoordinates;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public RouteEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public UserLevelEnum getLevel() {
        return level;
    }

    public RouteEntity setLevel(UserLevelEnum level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public RouteEntity setName(String name) {
        this.name = name;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public RouteEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public RouteEntity setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public Set<CategoryEntity> getCategories() {
        return categories;
    }

    public RouteEntity setCategories(Set<CategoryEntity> categories) {
        this.categories = categories;
        return this;
    }

    public Set<PictureEntity> getPictures() {
        return pictures;
    }

    public RouteEntity setPictures(Set<PictureEntity> pictures) {
        this.pictures = pictures;
        return this;
    }


    public Set<CommentEntity> getComments() {
        return comments;
    }

    public RouteEntity setComments(Set<CommentEntity> comments) {
        this.comments = comments;
        return this;
    }
}

//•	gpx coordinates - Accepts very long text values
//•	level - Accepts the levels of the routes (BEGINNER, INTERMEDIATE, ADVANCED) as values
//•	name - Accepts String values
//•	author - Accepts User Entities as values
//•	video url – Accepts the ids of youtube videos as values