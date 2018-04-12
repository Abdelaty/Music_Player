package com.example.abdel.musicplayer;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    public View view;
    Button button;
    ImageButton imageButton4;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<music> artist = new ArrayList<>();
        artist.add(new music("Om Kalthoum", "15 Albums", "210 Songs", R.drawable.oumkalthoum));
        artist.add(new music("Wardah", "10 Albums", "80 Songs", R.drawable.wardah));
        artist.add(new music("Abdelhallim", "7 Albums", "75 Songs", R.drawable.abdelhalim));
        artist.add(new music("Mohammed Fareed", "6 Albums", "75 Songs", R.drawable.mohamedfareed));
        artist.add(new music("Ahmed Mekky", "4 Albums", "95 Songs", R.drawable.ahmedmeky));
        artist.add(new music("Nancy Ajram", "2 Albums", "7 Songs", R.drawable.nancy));

        ArtistAdapter artistsAdapter = new ArtistAdapter(this, artist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(artistsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent myIntent = new Intent(ArtistsActivity.this,
                        OmKalthoumActivity.class);
                startActivity(myIntent);
            }
        });
        imageButton4 = findViewById(R.id.artist_Back);

        // Capture button clicks
        imageButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(ArtistsActivity.this,
                        MainActivity.class);
                startActivity(myIntent1);
            }
        });

    }
}
