package com.example.android.javaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.trackdata_listvu);

    //Creates Reader TrackData ArrayList containing artistDetails and trackDetails
    ArrayList<TrackData> track = new ArrayList<TrackData>();
    track.add(new TrackData("3Oh!3 -Click to Play", "Colorado Sunrise"));
    track.add(new TrackData("Luke Brian -Click to Play", "Drunk On You"));
    track.add(new TrackData("Marilyn Manson -Click to Play", "Tainted Love"));
    track.add(new TrackData("I.C.P. -Click to Play", "Let's Go All The Way"));
    track.add(new TrackData("Florida Georgia Line -Click to Play", "H.O.L.Y."));
    track.add(new TrackData("The Five Stars -Click to Play", "Atom Bomb Baby"));
    track.add(new TrackData("Red Hot Chili Peppers -Click to Play", "Soul to Squeeze"));
    track.add(new TrackData("Elton Britt -Click to Play", "Uranium Fever"));
    track.add(new TrackData("Rae Sremmurd -Click to Play", "Somebody Come Get Her"));
    track.add(new TrackData("Flo Rida -Click to Play","Whistle"));

    //Creates an {@link ArrayAdapter} that takes TrackData (artistDetails, and trackDetails) from Elements in ArrayList.
    //Adapter uses onCreate defined layout resource: trackdata_listvu.xml to inflate Elements into its attached ListView
    //Element inflates to a single {@link TextView} given id: list, that the adapter uses to display trackData and artistData at index position
    TrackDataAdapter adapter = new TrackDataAdapter(this, track);

    //Finds {@link ListView} object with the id: list within this activity's xml resource file.
    ListView trackView = (ListView) findViewById(R.id.list);

    //Attach {@link ArrayAdapter} to {@link ListView} calling setAdapter on ListView & passing an
    //argument: adapter (variable name given to {@link ArrayAdapter TrackDataAdapter})
    trackView.setAdapter(adapter);
    }
}
