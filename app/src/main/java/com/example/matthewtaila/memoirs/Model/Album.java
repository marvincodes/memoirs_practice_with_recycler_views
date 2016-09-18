package com.example.matthewtaila.memoirs.Model;

/**
 * Created by matthewtaila on 9/18/16.
 */
public class Album {

    String title;
    String date;
    boolean favorite;

    public Album() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}
