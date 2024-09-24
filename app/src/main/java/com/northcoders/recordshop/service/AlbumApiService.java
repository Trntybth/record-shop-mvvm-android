package com.northcoders.recordshop.service;

import com.northcoders.recordshop.model.Album;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface AlbumApiService {
    @POST("records")
    Call<List<Album>> addAlbum(@Body Album album);

    @GET("records")
    Call<List<Album>> getAllAlbums();
}