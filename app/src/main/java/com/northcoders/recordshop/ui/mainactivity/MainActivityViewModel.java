package com.northcoders.recordshop.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;


import com.northcoders.recordshop.model.Album;
import com.northcoders.recordshop.model.AlbumRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private AlbumRepository albumRepository;
    private MutableLiveData<List<Album>> albumLiveData;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        albumRepository = new AlbumRepository(application);
    }
    public LiveData<List<Album>> getAllAlbums() {
        return albumRepository.getMutableLiveData();
    }
}