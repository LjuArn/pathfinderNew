package com.example.pathfindernew.domain.entity;

import com.example.pathfindernew.domain.entity.enums.RoleNameEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{

    @Column
    @Enumerated(EnumType.STRING)
    private RoleNameEnum role;

    public RoleEntity() {
    }

    public RoleNameEnum getRole() {
        return role;
    }

    public RoleEntity setRole(RoleNameEnum role) {
        this.role = role;
        return this;
    }
}
