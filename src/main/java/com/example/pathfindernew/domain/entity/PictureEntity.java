package com.example.pathfindernew.domain.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "pictures")
public class PictureEntity extends BaseEntity{

    @Column(nullable = false)
    private String title;
    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String url;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private UserEntity author;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private RouteEntity route;


    public PictureEntity() {
    }


    public String getTitle() {
        return title;
    }

    public PictureEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public PictureEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public PictureEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public PictureEntity setRoute(RouteEntity route) {
        this.route = route;
        return this;
    }
}
//•	title - Accepts String values
//•	url - Accepts very long String values
//•	author - Accepts User Entities as values
//•	route - Accepts Route Entities as values