package com.example.android.javaplayer;

public class TrackData {
    /** Artist details to display */
    private String mArtistDetails;


    /** Track details to display */
    private String mTrackDetails;

    /**
     * @param artistDetails is the name of Recording Artist
     * @param trackDetails is the name of song or audio type selected
     */
    public TrackData(String artistDetails, String trackDetails){
        mArtistDetails = artistDetails;
        mTrackDetails = trackDetails;
    }

    /** Get artist details of tracks */
    public String getArtistDetails() { return mArtistDetails;
    }

    /** Get track details of tracks */
    public String getTrackDetails() { return mTrackDetails;
    }
}
