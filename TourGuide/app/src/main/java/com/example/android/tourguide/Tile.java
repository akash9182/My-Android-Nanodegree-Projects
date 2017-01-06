package com.example.android.tourguide;

/**
 * Created by akash on 11/10/16.
 */

public class Tile {

    private String mName;
    private int mImageResourceId;
    private String mLocation;
    private String mOneLineDescription;
    private String mDescription;
    private String mTimings;

    public Tile(int imageResourceId, String name, String location, String oneLineDescription, String description, String timings) {

        mImageResourceId = imageResourceId;
        mName = name;
        mLocation = location;
        mOneLineDescription = oneLineDescription;
        mDescription = description;
        mTimings = timings;

    }


    // getter methods


    public String getName() {
        return mName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getOneLineDescriptionDescription() {
        return mOneLineDescription;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getTimings() {
        return mTimings;
    }

}
