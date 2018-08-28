package com.example.android.javaplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ReaderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.trackdata_listvu);

    //Creates Reader TrackData ArrayList containing artistDetails and trackDetails
    ArrayList<TrackData> track = new ArrayList<TrackData>();
    track.add(new TrackData("Jules Verne -Click to Play", "20,000 Leagues Under the Sea"));
    track.add(new TrackData("H.G. Wells -Click to Play", "The Time Machine"));
    track.add(new TrackData("William Shakespeare -Click to Play", "A Midsummer Night Dream"));
    track.add(new TrackData("E.L. James -Click to Play", "50 Shades of Grey"));
    track.add(new TrackData("Jules Verne -Click to Play", "Journey to the Center of the Earth"));
    track.add(new TrackData("Edgar Allen Poe -Click to Play", "Tell Tale Heart"));
    track.add(new TrackData("Frank L. Baum -Click to Play", "Emerald City of Oz"));
    track.add(new TrackData("William Shakespeare -Click to Play", "Romeo and Juliet"));
    track.add(new TrackData("Lewis Carroll -Click to Play", "Alice Adventure in Wonderland"));
    track.add(new TrackData("Stephen King -Click to Play","The Dark Tower"));

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
