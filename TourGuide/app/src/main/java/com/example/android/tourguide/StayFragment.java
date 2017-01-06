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
public class StayFragment extends Fragment {

    public StayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tile_list, container, false);

        final ArrayList<Tile> stay = new ArrayList<Tile>();

        stay.add(new Tile(
                R.drawable.stay_image_activity_1,
                getResources().getString(R.string.stay_name_activity_1),
                getResources().getString(R.string.stay_location_activity_1),
                getResources().getString(R.string.stay_oneLineDescription_activity_1),
                getResources().getString(R.string.stay_description_activity_1),
                getResources().getString(R.string.stay_timings_acvivity_1)
        ));

        stay.add(new Tile(
                R.drawable.stay_image_activity_2,
                getResources().getString(R.string.stay_name_activity_2),
                getResources().getString(R.string.stay_location_activity_2),
                getResources().getString(R.string.stay_oneLineDescription_activity_2),
                getResources().getString(R.string.stay_description_activity_2),
                getResources().getString(R.string.stay_timings_acvivity_2)
        ));


        stay.add(new Tile(
                R.drawable.stay_image_activity_3,
                getResources().getString(R.string.stay_name_activity_3),
                getResources().getString(R.string.stay_location_activity_3),
                getResources().getString(R.string.stay_oneLineDescription_activity_3),
                getResources().getString(R.string.stay_description_activity_3),
                getResources().getString(R.string.stay_timings_acvivity_3)
        ));

        TileAdapter placesAdapter = new TileAdapter(getActivity(), stay);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

        return rootView;
    }
}
