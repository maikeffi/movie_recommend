package com.maikeffi.geektrust.movie.recommend.app;

import com.maikeffi.geektrust.movie.recommend.service.ReadCsvFiles;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        ReadCsvFiles readCsvFiles = new ReadCsvFiles();
        // this method process both movie csv and credits csv and loads them into elastic search db on localhost:9200
        readCsvFiles.loadMovieDataToElasticSearch();
    }
}
