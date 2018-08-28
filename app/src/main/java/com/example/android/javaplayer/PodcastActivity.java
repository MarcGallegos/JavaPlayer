package com.example.android.javaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PodcastActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trackdata_listvu);

    //Creates Reader TrackData ArrayList containing artistDetails and trackDetails
    ArrayList<TrackData> track = new ArrayList<TrackData>();
    track.add(new TrackData("various -Click to Play", "Waypoint Radio"));
    track.add(new TrackData("various -Click to Play", "Android Authority"));
    track.add(new TrackData("various -Click to Play", "Fragmented"));
    track.add(new TrackData("various -Click to Play", "What\'s Good Games"));
    track.add(new TrackData("various -Click to Play", "What the Tech?"));
    track.add(new TrackData("various -Click to Play", "Webmaster Radio.FM"));
    track.add(new TrackData("various -Click to Play", "Secret Cabal Gaming Project"));
    track.add(new TrackData("various -Click to Play", "Coding Blocks"));
    track.add(new TrackData("various -Click to Play", "Android Central"));
    track.add(new TrackData("various -Click to Play","Kinda Funny Gamecast"));

    //Creates an {@link ArrayAdapter} that takes TrackData (artistDetails, and trackDetails) from Elements in ArrayList.
    //Adapter uses onCreate defined layout resource: trackdata_listvu.xml to inflate Elements into its attached ListView
    //Element inflates to a single {@link TextView} given id: list, that the adapter uses to display trackData and artistData at index position
    TrackDataAdapter adapter = new TrackDataAdapter(this, track);

    //Finds {@link ListView} object with the id: list within this activity's xml resource file.
    ListView trackView = (ListView) findViewById(R.id.list);

    //Attach {@link ArrayAdapter} to {@link ListView} calling setAdapter on ListView & passing the
    // single argument: adapter (variable name given to {@link ArrayAdapter})
    trackView.setAdapter(adapter);
    }
}
