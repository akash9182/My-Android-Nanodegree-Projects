/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Fragment that displays "Monday".
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tile_list, container, false);

        final ArrayList<Tile> places = new ArrayList<Tile>();

        places.add(new Tile(
                R.drawable.image_activity_1,
                getResources().getString(R.string.places_name_activity_1),
                getResources().getString(R.string.places_location_activity_1),
                getResources().getString(R.string.places_oneLineDescription_activity_1),
                getResources().getString(R.string.places_description_activity_1),
                getResources().getString(R.string.places_timings_acvivity_1)
        ));

        places.add(new Tile(
                R.drawable.image_activity_2,
                getResources().getString(R.string.places_name_activity_2),
                getResources().getString(R.string.places_location_activity_2),
                getResources().getString(R.string.places_oneLineDescription_activity_2),
                getResources().getString(R.string.places_description_activity_2),
                getResources().getString(R.string.places_timings_acvivity_2)
        ));

        places.add(new Tile(
                R.drawable.image_activity_3,
                getResources().getString(R.string.places_name_activity_3),
                getResources().getString(R.string.places_location_activity_3),
                getResources().getString(R.string.places_oneLineDescription_activity_3),
                getResources().getString(R.string.places_description_activity_3),
                getResources().getString(R.string.places_timings_acvivity_3)
        ));

        places.add(new Tile(
                R.drawable.image_activity_4,
                getResources().getString(R.string.places_name_activity_4),
                getResources().getString(R.string.places_location_activity_4),
                getResources().getString(R.string.places_oneLineDescription_activity_4),
                getResources().getString(R.string.places_description_activity_4),
                getResources().getString(R.string.places_timings_acvivity_4)
        ));

        places.add(new Tile(
                R.drawable.image_activity_5,
                getResources().getString(R.string.places_name_activity_5),
                getResources().getString(R.string.places_location_activity_5),
                getResources().getString(R.string.places_oneLineDescription_activity_5),
                getResources().getString(R.string.places_description_activity_5),
                getResources().getString(R.string.places_timings_acvivity_5)
        ));
        places.add(new Tile(
                R.drawable.image_activity_6,
                getResources().getString(R.string.places_name_activity_6),
                getResources().getString(R.string.places_location_activity_6),
                getResources().getString(R.string.places_oneLineDescription_activity_6),
                getResources().getString(R.string.places_description_activity_6),
                getResources().getString(R.string.places_timings_acvivity_6)
        ));
        places.add(new Tile(
                R.drawable.image_activity_7,
                getResources().getString(R.string.places_name_activity_7),
                getResources().getString(R.string.places_location_activity_7),
                getResources().getString(R.string.places_oneLineDescription_activity_7),
                getResources().getString(R.string.places_description_activity_7),
                getResources().getString(R.string.places_timings_acvivity_7)
        ));

        TileAdapter placesAdapter = new TileAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

        return rootView;
    }
}
