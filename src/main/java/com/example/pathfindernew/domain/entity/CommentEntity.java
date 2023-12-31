package com.example.pathfindernew.domain.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class CommentEntity extends BaseEntity{

    @Column(nullable = false)
    private Boolean approved;
    @Column(nullable = false)
    private LocalDateTime created;
    @Column(name = "text_content", columnDefinition = "LONGTEXT")
    private String textContent;
    @ManyToOne
    private UserEntity author;
    @ManyToOne
    private RouteEntity route;

    public CommentEntity() {
    }

    public Boolean getApproved() {
        return approved;
    }

    public CommentEntity setApproved(Boolean approved) {
        this.approved = approved;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public CommentEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public CommentEntity setTextContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public CommentEntity setAuthor(UserEntity author) {
        this.author = author;
        return this;
    }

    public RouteEntity getRoute() {
        return route;
    }

    public CommentEntity setRoute(RouteEntity route) {
        this.route = route;
        return this;
    }
}
//•	approved - Accepts boolean values
//•	created - Accepts Date and Time values
//o	 The values should not be future dates
//•	text content - Accepts very long text values
//•	author - Accepts User Entities as values
//•	route - Accepts Route Entities as values