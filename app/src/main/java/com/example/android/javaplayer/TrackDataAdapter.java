package com.example.android.javaplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackDataAdapter extends ArrayAdapter<TrackData> {
    public TrackDataAdapter(Activity context, ArrayList<TrackData> track){
    super(context,0,track);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

    //initialize convertView and store in variable trackObjectView
    View trackListView = convertView;

    //verify existing view is being recycled, else, inflate view
    if (trackListView==null) {
    trackListView = LayoutInflater.from(getContext()).inflate(R.layout.tracklist_blueprint, parent, false);
    }

    //get trackData located at this index position
    TrackData currentTrack = getItem(position);

    //Locates View by id: track_info_text_view stores in variable called trackView
    TextView trackView=trackListView.findViewById(R.id.track_info_text_view);

    //Gets track information from list and sets to TextView id: track_info_text_view a.k.a.trackView
    trackView.setText(currentTrack.getTrackDetails());


    //Locates View by id: artist_info_text_view stores in variable called artistView
    TextView artistView=trackListView.findViewById(R.id.artist_info_text_view);

    //Gets track information from list and sets to TextView id: artist_info_text_view a.k.a.artistView
    artistView.setText(currentTrack.getArtistDetails());

    //Returns trackListView View of type convertView
    return trackListView;
    }
}