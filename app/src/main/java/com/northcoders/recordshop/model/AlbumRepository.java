package com.northcoders.recordshop.model;
import android.app.Application;
import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

import com.northcoders.recordshop.service.AlbumApiService;
import com.northcoders.recordshop.service.RetroFitInstance;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
public class AlbumRepository {
    private static MutableLiveData<List<Album>> mutableLiveData = new MutableLiveData<>();
    private Application application;
    public AlbumRepository(Application application) {
        this.application = application;
    }
    public static MutableLiveData<List<Album>> getMutableLiveData() {

        AlbumApiService albumApiService = RetroFitInstance.getService();
        Call<List<Album>> call = albumApiService.getAllAlbums();
        call.enqueue(new Callback<List<Album>>() {

            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                List<Album> albumList = response.body();
                mutableLiveData.postValue(albumList);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable throwable) {
                System.out.println("Error: " + throwable.getMessage());
            }
        });
        return mutableLiveData;
    }

}