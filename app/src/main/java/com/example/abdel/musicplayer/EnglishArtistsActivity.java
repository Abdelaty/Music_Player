package com.example.abdel.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishArtistsActivity extends AppCompatActivity {
    ImageButton imageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_artists);

        ArrayList<music> englishArtist = new ArrayList<>();
        englishArtist.add(new music("Eminem", "15 Albums", "210 Songs", R.drawable.eminem));
        englishArtist.add(new music("Ed Sheeran", "10 Albums", "80 Songs", R.drawable.sheraan));
        englishArtist.add(new music("Marshmello", "7 Albums", "75 Songs", R.drawable.marshmello));
        englishArtist.add(new music("Camila Cabello", " 6 Albums", "75 Songs", R.drawable.camila_cabello));
        englishArtist.add(new music("Rich Homie Quan", "4 Albums", "95 Songs", R.drawable.rich_homie_quan));
        englishArtist.add(new music("Rihanna", "2 Albums", "7 Songsnn", R.drawable.rihana));

        ArtistAdapter englishArtistsAdapter = new ArtistAdapter(this, englishArtist);
        ListView listView = findViewById(R.id.english_list);
        listView.setAdapter(englishArtistsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent myIntent = new Intent(EnglishArtistsActivity.this,
                        EminemActivity.class);
                startActivity(myIntent);
            }
        });
        imageButton2 = findViewById(R.id.english_artist_Back);

        // Capture button clicks
        imageButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(EnglishArtistsActivity.this,
                        MainActivity.class);
                startActivity(myIntent1);
            }
        });
    }
}
