package com.example.android.tourguide;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by akash on 11/10/16.
 */

public class TileAdapter extends ArrayAdapter<Tile> {

    public TileAdapter(Activity context, ArrayList tile) {
        super(context, 0, tile);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View viewAttractions = convertView;
        final TileViewHolder viewHolder;

        if (viewAttractions == null) {
            viewAttractions = LayoutInflater.from(getContext()).inflate(R.layout.tile_layout, parent, false);

            viewHolder = new TileViewHolder();
            viewHolder.image = (ImageView) viewAttractions.findViewById(R.id.image);
            viewHolder.nameOfTile = (TextView) viewAttractions.findViewById(R.id.name);
            viewHolder.oneLineDescription = (TextView) viewAttractions.findViewById(R.id.short_description_text);
            viewHolder.description = (TextView) viewAttractions.findViewById(R.id.see_more);
            viewHolder.maps = (TextView) viewAttractions.findViewById(R.id.get_directions);
            viewAttractions.setTag(viewHolder);
        } else {
            viewHolder = (TileViewHolder) viewAttractions.getTag();
        }

        final Tile attraction = getItem(position);
        viewHolder.image.setImageResource(attraction.getImageResourceId());
        viewHolder.nameOfTile.setText(attraction.getName());
        viewHolder.oneLineDescription.setText(attraction.getOneLineDescriptionDescription());

        viewHolder.description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent showMoreLayoutIntent = new Intent(getContext(), SeeMoreActivity.class);
                showMoreLayoutIntent.putExtra("name", attraction.getName());
                showMoreLayoutIntent.putExtra("imageResourceId", attraction.getImageResourceId());
                showMoreLayoutIntent.putExtra("description", attraction.getDescription());
                showMoreLayoutIntent.putExtra("timings", attraction.getTimings());
                getContext().startActivity(showMoreLayoutIntent);
            }
        });

        viewHolder.maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("geo:" + attraction.getLocation());
                // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                // Make the Intent explicit by setting the Google Maps package
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getContext().getPackageManager()) != null) {
                    // Attempt to start an activity that can handle the Intent
                    getContext().startActivity(mapIntent);
                }
            }
        });

        return viewAttractions;
    }
}