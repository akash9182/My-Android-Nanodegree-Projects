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

import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * Fragment that displays "Monday".
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tile_list, container, false);

        final ArrayList<Tile> food = new ArrayList<Tile>();

        food.add(new Tile(
                R.drawable.food_image_activity_1,
                getResources().getString(R.string.food_name_activity_1),
                getResources().getString(R.string.food_location_activity_1),
                getResources().getString(R.string.food_oneLineDescription_activity_1),
                getResources().getString(R.string.food_description_activity_1),
                getResources().getString(R.string.food_timings_acvivity_1)
        ));

        food.add(new Tile(
                R.drawable.food_image_activity_2,
                getResources().getString(R.string.food_name_activity_2),
                getResources().getString(R.string.food_location_activity_2),
                getResources().getString(R.string.food_oneLineDescription_activity_2),
                getResources().getString(R.string.food_description_activity_2),
                getResources().getString(R.string.food_timings_acvivity_2)
        ));

        food.add(new Tile(
                R.drawable.food_image_activity_3,
                getResources().getString(R.string.food_name_activity_3),
                getResources().getString(R.string.food_location_activity_3),
                getResources().getString(R.string.food_oneLineDescription_activity_3),
                getResources().getString(R.string.food_description_activity_3),
                getResources().getString(R.string.food_timings_acvivity_3)
        ));

        food.add(new Tile(
                R.drawable.food_image_activity_4,
                getResources().getString(R.string.food_name_activity_4),
                getResources().getString(R.string.food_location_activity_4),
                getResources().getString(R.string.food_oneLineDescription_activity_4),
                getResources().getString(R.string.food_description_activity_4),
                getResources().getString(R.string.food_timings_acvivity_4)
        ));

        food.add(new Tile(
                R.drawable.food_image_activity_5,
                getResources().getString(R.string.food_name_activity_5),
                getResources().getString(R.string.food_location_activity_5),
                getResources().getString(R.string.food_oneLineDescription_activity_5),
                getResources().getString(R.string.food_description_activity_5),
                getResources().getString(R.string.food_timings_acvivity_5)
        ));
        TileAdapter placesAdapter = new TileAdapter(getActivity(), food);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

        return rootView;
    }

}
