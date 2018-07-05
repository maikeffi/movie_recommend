package com.maikeffi.geektrust.movie.recommend.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.lang.reflect.Type;

import com.maikeffi.geektrust.movie.recommend.model.*;


public class ReadCsvFiles {
    FileConfig fileConfig = new FileConfig();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    ElasticApiServices elasticApiServices = new ElasticApiServices();



    public void loadMovieDataToElasticSearch() throws FileNotFoundException {
        buildMovieListFromCsv().forEach(movie -> {
            elasticApiServices.getElasticSearchInterface().addMovieToElasticSearch(movie);
        });
    }

    private List<Movie> buildMovieListFromCsv() throws FileNotFoundException {
        List<Movie> movieList = new ArrayList<>();
        List<CreditFile> creditFileLis = buildObjectsFromCreditFIle();
        readMovieFileCsv().forEach(csvMovieFile -> {
            creditFileLis.forEach(creditFile -> {
                if (creditFile.getMovieId() == csvMovieFile.getId()){
                    try {
                        movieList.add(getMovieObject(creditFile,csvMovieFile));
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (ParseException e) {
                        System.out.println(csvMovieFile.getTitle() +" Has no Proper Value");
                        //e.printStackTrace();
                    }
                }
            });
        });
        return movieList;
    }


    private List<CreditFile> buildObjectsFromCreditFIle() throws FileNotFoundException {
        List<CreditFile> creditFiles = new ArrayList<>();

        readCreditFileCsv().forEach(creditFileStructure -> {
            CreditFile creditFile = new CreditFile();
            creditFile.setMovieId(creditFileStructure.getMovieId());
            creditFile.setTitle(creditFileStructure.getTitle());
            try {
                creditFile.setCasts(returnListOfObjectFromString(creditFileStructure.getCast(),Cast.class));
                creditFile.setCrews(returnListOfObjectFromString(creditFileStructure.getCrew(),Crew.class));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }

            creditFiles.add(creditFile);

        });

        return creditFiles;
    }

    private Movie getMovieObject(CreditFile creditFile,CsvMovieFile csvMovieFile) throws InstantiationException, IllegalAccessException, ParseException {
        Movie movie = new Movie();
        movie.setId(csvMovieFile.getId());
        movie.setTitle(csvMovieFile.getTitle());
        movie.setGenres(returnListOfObjectFromString(csvMovieFile.getGenres(),BaseEntity.class));
        movie.setKeywords(returnListOfObjectFromString(csvMovieFile.getKeywords(),BaseEntity.class));
        movie.setCasts(creditFile.getCasts());
        movie.setCrews(creditFile.getCrews());
        movie.setReleaseDate(new SimpleDateFormat("yyyy-MM-dd").parse(csvMovieFile.getRelease_date()));
        movie.setRuntime(csvMovieFile.getRuntime());
        movie.setUrl(csvMovieFile.getHomepage());
        movie.setProductionCompanies(returnListOfObjectFromString(csvMovieFile.getProduction_companies(),BaseEntity.class));
        movie.setBudget(csvMovieFile.getBudget());
        movie.setRevenue(csvMovieFile.getRevenue());
        movie.setPopularity(csvMovieFile.getPopularity());
        movie.setVoteAverage(csvMovieFile.getVote_average());
        movie.setVoteCount(csvMovieFile.getVote_count());
        movie.setLanguage(csvMovieFile.getOriginal_language());
        return movie;
    }
    private List<CsvMovieFile> readMovieFileCsv() throws FileNotFoundException{
        return readCsvFileAndReturnList(CsvMovieFile.class,fileConfig.movies_file);
    }

    private List<CsvCreditFile> readCreditFileCsv() throws FileNotFoundException {
        return readCsvFileAndReturnList(CsvCreditFile.class,fileConfig.credits_file);
    }



    private <T> List<T> readCsvFileAndReturnList(Class<T> tClass,String filePath) throws FileNotFoundException {
        List<T> fileLines = new CsvToBeanBuilder(new FileReader(filePath))
                .withType(tClass)
                .withQuoteChar('\"').build().parse();
        return fileLines;
    }

    private <T> List<T> returnListOfObjectFromString(String string,Class<T> tClass) throws IllegalAccessException, InstantiationException {
        List<T> list = gson.fromJson(string.replaceAll("\"\"", ""),getListTypeFromObject(tClass.newInstance()));
        return list;
    }

    private Type getListTypeFromObject(Object c) {
        return new TypeToken<ArrayList<Object>>(){}.getType();
    }


}
