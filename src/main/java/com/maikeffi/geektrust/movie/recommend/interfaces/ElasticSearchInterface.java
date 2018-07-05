package com.maikeffi.geektrust.movie.recommend.interfaces;

import com.maikeffi.geektrust.movie.recommend.model.Movie;
import feign.Headers;
import feign.RequestLine;

public interface ElasticSearchInterface {

    @RequestLine("POST /movies/movie")
    @Headers("Content-Type: application/json")
    void addMovieToElasticSearch(Movie movie);
}
