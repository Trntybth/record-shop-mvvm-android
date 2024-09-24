package com.northcoders.recordshop.model;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.google.gson.annotations.SerializedName;

public class Album extends BaseObservable {
    @SerializedName("album_id")
    private String id;
    @SerializedName("album_title")
    private String title;
    @SerializedName("album_id")
    private String artist;
    @SerializedName("album_release_year")
    private String releaseYear;
    @SerializedName("album_genre")
    private String genre;
    @SerializedName("album_stock_tracker")
    private String stockTracker;

    public Album(String id, String title, String artist, String releaseYear, String genre, String stockTracker) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.stockTracker = stockTracker;
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
    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
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
    @Bindable
    public String getStockTracker() {
        return stockTracker;
    }

    public void setStockTracker(String stockTracker) {
        this.stockTracker = stockTracker;
        notifyPropertyChanged(BR.stockTracker);
    }

}