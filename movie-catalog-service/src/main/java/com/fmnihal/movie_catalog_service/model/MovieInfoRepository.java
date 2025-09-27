package com.fmnihal.movie_catalog_service.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo, Long> {

    List<MovieInfo> saveAll(List<MovieInfo> movieInfoList);

    List<MovieInfo> findAll();

    Object findById(Long movieInfoId);

}