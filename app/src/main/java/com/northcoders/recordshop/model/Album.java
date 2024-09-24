package com.northcoders.recordshop.model;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.northcoders.recordshop.BR;

public class Album extends BaseObservable {
    @Expose
    private String id;
    @Expose
    private String title;
    @Expose
    private String artist;
    @Expose
    private int releaseYear;
    @Expose
    private String genre;


    public Album(String id, String title, String artist, int releaseYear, String genre) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public Album() {}

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }
    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }
    @Bindable
    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        notifyPropertyChanged(BR.releaseYear);
    }
    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }
//    @Bindable
//    public String getStockTracker() {
//        return stockTracker;
//    }
//
//    public void setStockTracker(String stockTracker) {
//        this.stockTracker = stockTracker;
//        notifyPropertyChanged(BR.stockTracker);
//    }

}