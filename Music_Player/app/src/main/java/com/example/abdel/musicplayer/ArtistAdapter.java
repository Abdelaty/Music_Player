package com.example.abdel.musicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abdel on 3/14/2018.
 */

public class ArtistAdapter extends ArrayAdapter {
    ArtistAdapter(Activity context, ArrayList<music> artists) {
        super(context, 0, artists);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        music currentArtist = (music) getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.ArtistNameTextView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        assert currentArtist != null;
        nameTextView.setText(currentArtist.getmArtistName());


        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.AlbumsTextView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        albumTextView.setText(currentArtist.getmArtistAlbums());


        TextView numberTextView = (TextView) listItemView.findViewById(R.id.SongsTextView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentArtist.getmArtistSongs());
        // Find the ImageView in the list_item.xml layout with the ID list_item_icon


        ImageView iconView = (ImageView) listItemView.findViewById(R.id.artist_photo);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.getDrawable();


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
