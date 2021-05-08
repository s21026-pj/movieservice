package com.movieservice.alepen.service;

import com.movieservice.alepen.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    public List<Movie> getAllMovies(){
        Movie movie1=new Movie(123L,"IT", Movie.Category.HORROR);
        Movie movie2=new Movie(124L,"Shrek", Movie.Category.COMEDY);
        Movie movie3=new Movie(125L,"Avatar", Movie.Category.SCIFI);

        return List.of(movie1,movie2,movie3);
    }

    public Movie getOneMovie(Long id){
        Movie movie1=new Movie(123L,"IT", Movie.Category.HORROR);
        return movie1;

        }


}
