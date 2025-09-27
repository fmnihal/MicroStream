package com.fmnihal.movie_catalog_service.controller;

import com.fmnihal.movie_catalog_service.model.MovieInfo;
import com.fmnihal.movie_catalog_service.model.MovieInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

    @Autowired
    private MovieInfoRepository repository;

    @PostMapping("/save")
    public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList) {
        return repository.saveAll(movieInfoList);
    }

    @GetMapping("/list")
    public List<MovieInfo> getAll() {
        return repository.findAll();
    }

    // @GetMapping("/find-path-by-id/{movieInfoId}")
    // public String findPathById(@PathVariable Long movieInfoId) {
    //     var videoInfoOptional = repository.findById(movieInfoId);
    //     return videoInfoOptional.map(MovieInfo::getPath).orElse(null);
    // }
}