package com.maikeffi.geektrust.movie.recommend.service;

import com.maikeffi.geektrust.movie.recommend.interfaces.ElasticSearchInterface;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;

public class ElasticApiServices {

    public ElasticSearchInterface elasticSearchInterface;

    //Download Elastic Search and run in local host port is : 9200

    public ElasticSearchInterface getElasticSearchInterface() {
        if (elasticSearchInterface==null){
            elasticSearchInterface = createClient(ElasticSearchInterface.class,"http://localhost:9200/");
        }
        return elasticSearchInterface;
    }

    private static  <T> T createClient(Class<T> type, String uri) {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                //.logger(new Slf4jLogger(type))
                //.logLevel(Logger.Level.FULL)
                .target(type, uri);
    }
}
