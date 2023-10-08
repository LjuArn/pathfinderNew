package com.example.pathfindernew.repository;

import com.example.pathfindernew.domain.entity.PictureEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PictureRepository extends JpaRepository<PictureEntity, Long> {

    @Query("SELECT p.url from PictureEntity p")
    List<String> FindAllUrls();
}
