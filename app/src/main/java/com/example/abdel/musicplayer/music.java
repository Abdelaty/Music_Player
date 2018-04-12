package com.example.abdel.musicplayer;

/**
 * Created by Abdel on 3/14/2018.
 */

public class music {
    private String mArtistName, mArtistAlbuums, mArtistSongs;
    private int mImageView, mMusicResourseId;

    music(String artistName, String artistAlbums, String artistSongs, int image) {

        mArtistAlbuums = artistAlbums;
        mArtistName = artistName;
        mArtistSongs = artistSongs;
        mImageView = image;
    }

    music(String albums, String songsNumber, int image) {

        mArtistAlbuums = albums;
        mImageView = image;
    }

    music(String songName, int image, int audioResourceId) {
        mArtistSongs = songName;
        mImageView = image;
        mMusicResourseId = audioResourceId;
    }

    music(String songName, int image) {
        mArtistSongs = songName;
        mImageView = image;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public String getmArtistAlbums() {
        return mArtistAlbuums;
    }

    public String getmArtistSongs() {
        return mArtistSongs;
    }

    public int getImageResourceId() {
        return mImageView;
    }

    public int getmMusicResourseId() {
        return mMusicResourseId;
    }

}
