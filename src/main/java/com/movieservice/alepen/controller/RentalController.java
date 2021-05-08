package com.movieservice.alepen.controller;

import com.movieservice.alepen.model.Movie;
import com.movieservice.alepen.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rent")
public class RentalController {

    @Autowired
    private final MovieService movieService;

    public RentalController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public ResponseEntity<List<Movie>> getAllMoviesList() {
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getSpecificMovie(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.getOneMovie(id));
    }
    @PostMapping("/movies")
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addOneMovie(movie));
    }
    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        return ResponseEntity.ok(movieService.updateOneMovie(id,movie));
    }
    @DeleteMapping("/movies/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
        movieService.deleteOneMovie(id);
        return ResponseEntity.ok().build();
    }
}
