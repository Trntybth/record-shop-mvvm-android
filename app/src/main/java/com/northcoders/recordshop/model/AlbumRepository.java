package com.northcoders.recordshop.model;
import android.app.Application;
import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;
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

}