package com.example.user.foragelistview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class FavouriteForageAdapter extends ArrayAdapter {

    public FavouriteForageAdapter(Context context, ArrayList<Forage> guide){
        super(context, 0, guide);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.forage_items, parent, false);
        }

        Forage currentItem = getItem(position);

        ImageView type = (ImageView) listItemView.findViewById(R.id.forage_image_type);
        type.setBackground(getImageByEnum(currentItem.getType());

        TextView title = (TextView) listItemView.findViewById(R.id.forage_name);
        title.setText(currentItem.getName());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentMovie.getYear().toString());
//
        listItemView.setTag(currentItem);

        return listItemView;
    }
}
