package com.example.abdel.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

public class EminemActivity extends AppCompatActivity {
    ImageButton imageButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eminem);

        ArrayList<music> eminemList = new ArrayList<>();
        eminemList.add(new music("REVIVLE", "19", R.drawable.revivle));
        eminemList.add(new music("RECOVERY", "1", R.drawable.recovery));

        ArtistAdapter artistsAdapter = new ArtistAdapter(this, eminemList);
        ListView listView = findViewById(R.id.eminemList);
        listView.setAdapter(artistsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(EminemActivity.this,
                        RevivleEminem.class);
                startActivity(myIntent);
            }
        });
        imageButton1 = findViewById(R.id.eminemBack);

        // Capture button clicks
        imageButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(EminemActivity.this,
                        EnglishArtistsActivity.class);
                startActivity(myIntent1);
            }
        });
    }
}

