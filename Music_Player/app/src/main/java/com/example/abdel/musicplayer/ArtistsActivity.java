package com.example.abdel.musicplayer;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistsActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ArrayList<music> artist = new ArrayList<>();
        artist.add(new music("Om Kalthoum", 15, 210, ResourcesCompat.getDrawable(getResources(),R.drawable.oumkalthoum,null)));
    /*    artist.add(new music("Wardah", 10, 80, getDrawable(R.drawable.wardah)));
        artist.add(new music("Abdelhallim", 7, 75,getDrawable(R.drawable.abdelhalim)));
        artist.add(new music("Mohammed Fareed", 6, 75,getDrawable(R.drawable.mohamedfareed)));
        artist.add(new music("Ahmed Mekky", 4, 95, getDrawable(R.drawable.ahmedmeky)));
        artist.add(new music("Nancy Ajram", 2, 7,getDrawable(R.drawable.nancy)));
      /*  music.add(new music ("Shadyah",6,20,));
        music.add(new music ("Omar Khairat",0,120,));*/

        ArtistAdapter artistsAdapter = new ArtistAdapter(this, artist);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(artistsAdapter);




      /*  View view = (View) findViewById(R.id.omKalthoumImage);
        // Capture button clicks
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(ArtistsActivity.this,
                        OmKalthoumActivity.class);
                startActivity(myIntent);
            }
        });*/
    }
}
