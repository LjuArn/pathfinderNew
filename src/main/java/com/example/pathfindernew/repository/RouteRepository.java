package com.example.pathfindernew.repository;

import com.example.pathfindernew.domain.entity.RouteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RouteRepository extends JpaRepository<RouteEntity, Long> {
}
