package com.example.pojo;

import com.example.constants.Format;
import com.example.constants.Genre;

import java.util.List;

public class Movie {

    long id;
    String name;
    List<Language> language;
    List<Genre> genres;
    List<Format> formats;

    // as of now I have not considered movie details like cast , promo etc...


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Language> getLanguage() {
        return language;
    }

    public void setLanguage(List<Language> language) {
        this.language = language;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Format> getFormats() {
        return formats;
    }

    public void setFormats(List<Format> formats) {
        this.formats = formats;
    }
}
