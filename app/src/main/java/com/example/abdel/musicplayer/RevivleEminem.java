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

public class RevivleEminem extends AppCompatActivity {
    int isPlay = 0;
    ImageButton imageButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revivle_eminem);
        ArrayList<music> eminemTracks = new ArrayList<>();
        eminemTracks.add(new music("1. Walk On Water (feat. Beyoncé)", R.drawable.revivle, R.raw.walk_on_water));
        eminemTracks.add(new music("2. Believe", R.drawable.revivle));
        eminemTracks.add(new music("3. Chloraseptic (feat. PHRESHER)", R.drawable.revivle));
        eminemTracks.add(new music("4. Untouchable", R.drawable.revivle));
        eminemTracks.add(new music("5. River (feat. Ed Sheeran)", R.drawable.revivle));
        eminemTracks.add(new music("6. Remind Me (Intro)", R.drawable.revivle));
        eminemTracks.add(new music("7. Remind Me", R.drawable.revivle));
        eminemTracks.add(new music("8. Revival (Interlude)", R.drawable.revivle));
        eminemTracks.add(new music("9. Like Home (feat. Alicia Keys)", R.drawable.revivle));
        eminemTracks.add(new music("10. Bad Husband (feat. X Ambassadors)", R.drawable.revivle));
        eminemTracks.add(new music("11. Tragic Endings (feat. Skylar Grey)", R.drawable.revivle));
        eminemTracks.add(new music("12. Framed", R.drawable.revivle));
        eminemTracks.add(new music("13. Nowhere Fast (feat. Kehlani)", R.drawable.revivle));
        eminemTracks.add(new music("14. Heat", R.drawable.revivle));
        eminemTracks.add(new music("15. Offended", R.drawable.revivle));
        eminemTracks.add(new music("16. Need Me (feat. P!nk)", R.drawable.revivle));
        eminemTracks.add(new music("17. In Your Head", R.drawable.revivle));
        eminemTracks.add(new music("18. Castle", R.drawable.revivle));
        eminemTracks.add(new music("19. Arose", R.drawable.revivle));
        ArtistAdapter artistsAdapter = new ArtistAdapter(this, eminemTracks);
        ListView listView = findViewById(R.id.revivleTracks);
        listView.setAdapter(artistsAdapter);
        mediaPlayer = MediaPlayer.create(this, R.raw.walk_on_water);

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
        imageButton = findViewById(R.id.revivleBack);

        // Capture button clicks
        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent1 = new Intent(RevivleEminem.this,
                        EminemActivity.class);
                startActivity(myIntent1);
            }
        });

    }
}
