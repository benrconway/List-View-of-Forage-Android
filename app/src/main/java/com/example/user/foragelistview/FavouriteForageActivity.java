package com.example.user.foragelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class FavouriteForageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_forage);

        FavouriteForage forage = new FavouriteForage();
        ArrayList<Forage> guide = forage.getGuide();

        FavouriteForageAdapter forageAdapter = new FavouriteForageAdapter(this, guide);


    }


}
