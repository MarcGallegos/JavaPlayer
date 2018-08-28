package com.example.android.javaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Find View representing Artist Activity
        TextView artists = (TextView)findViewById(R.id.music_cat);
        //Set an inline ClickListener on the view
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick (View view) {
        //Create a new intent to start the Artists Activity to listen to music
        Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);
        //Start the New Activity
        startActivity(artistsIntent);
        }});

        //Find View representing Podcast Activity
        TextView podcasts = (TextView)findViewById(R.id.podcast_cat);
        //Set an inline ClickListener on the view
        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick (View view) {
        //Create a new intent to start the Podcasts Activity to listen to podcasts
        Intent podcastsIntent = new Intent(MainActivity.this, PodcastActivity.class);
        //Start the New Activity
        startActivity(podcastsIntent);
        }});

        //Find View representing AudioBook (eBook) Activity
        TextView ebooks = (TextView)findViewById(R.id.abook_cat);
        //Set an inline ClickListener on the view
        ebooks.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick (View view){
        //Create a new intent to start the Reader Activity to listen to audio books
        Intent ebooksIntent = new Intent(MainActivity.this, ReaderActivity.class);
        //Start the New Activity
        startActivity(ebooksIntent);
        }});


    }
}
