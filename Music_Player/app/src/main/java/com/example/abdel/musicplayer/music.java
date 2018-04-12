package com.example.abdel.musicplayer;

import android.graphics.drawable.Drawable;

/**
 * Created by Abdel on 3/14/2018.
 */

public class music {
    private String mArtistName;
    private int mArtistAlbuums, mArtistSongs;
    private Drawable imageView;

     music(String artistName, int artistAlbums, int artistSongs, Drawable image) {

        mArtistAlbuums = artistAlbums;
        mArtistName = artistName;
        mArtistSongs = artistSongs;
        imageView = image;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public int getmArtistAlbums() {
        return mArtistAlbuums;
    }

    public int getmArtistSongs() {
        return mArtistSongs;
    }

    public Drawable getImageView() {

        return imageView;
    }
}
