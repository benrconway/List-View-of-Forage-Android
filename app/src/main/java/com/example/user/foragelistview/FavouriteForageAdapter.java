package com.example.user.foragelistview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.user.foragelistview.R.*;
import static com.example.user.foragelistview.Season.AUTUMN;
import static com.example.user.foragelistview.Season.SPRING;
import static com.example.user.foragelistview.Season.SUMMER;
import static com.example.user.foragelistview.Season.WINTER;

/**
 * Created by user on 20/09/2017.
 */

public class FavouriteForageAdapter extends ArrayAdapter<Forage> {

    public FavouriteForageAdapter(Context context, ArrayList<Forage> guide){
        super(context, 0, guide);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(layout.forage_items, parent, false);
        }

        Forage currentItem = getItem(position);

        ImageView type = (ImageView) listItemView.findViewById(id.forage_image_type);
        type.setBackground(getImageByEnum(currentItem.getType());

        TextView title = (TextView) listItemView.findViewById(id.forage_name);
        title.setText(currentItem.getName());

        TextView year = (TextView) listItemView.findViewById(id.forage_season);
        year.setText(currentItem.getSeasonAvailable());

        listItemView.setTag(currentItem);

        return listItemView;
    }

    public Drawable getImageByEnum(Enum<Edible> edibleEnum){

        }
        if(edibleEnum == Edible.FRUIT){
            drawable.fruit;

        }
    }


}

