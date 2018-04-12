package com.example.abdel.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class OmKalthoumActivity extends AppCompatActivity {
    int isPlay = 0;
    ImageButton imageButton3;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_om_kalthoum);
        ArrayList<music> omKalthoumTracks = new ArrayList<>();
        omKalthoumTracks.add(new music("El Awela fel Gharam", R.drawable.oumkalthoum, R.raw.al_aola_fe_elgharam));
        omKalthoumTracks.add(new music("Salou Qalbi", R.drawable.oumkalthoum));
        omKalthoumTracks.add(new music("Al Nil ", R.drawable.oumkalthoum));
        omKalthoumTracks.add(new music("Arouh Lemin", R.drawable.oumkalthoum));
        omKalthoumTracks.add(new music("Amal Hayati", R.drawable.oumkalthoum));

        ArtistAdapter artistsAdapter = new ArtistAdapter(this, omKalthoumTracks);
        ListView listView = findViewById(R.id.omKalthoumList);
        listView.setAdapter(artistsAdapter);
        mediaPlayer = MediaPlayer.create(this, R.raw.al_aola_fe_elgharam);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (isPlay == 0) {
                    mediaPlayer.start();
                    isPlay++;
                } else if (isPlay == 1) {
                    mediaPlayer.pause();
                    isPlay--;
                }
            }

        });
        imageButton3 = findViewById(R.id.omKalthoum_Back);

        // Capture button clicks
        imageButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(OmKalthoumActivity.this,
                        EminemActivity.class);
                startActivity(myIntent1);
            }
        });
    }

}