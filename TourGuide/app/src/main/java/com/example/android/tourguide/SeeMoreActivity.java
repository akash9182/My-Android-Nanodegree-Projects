package com.example.android.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by akash on 11/10/16.
 */

public class SeeMoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.see_more_activity);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int imageResourceId = intent.getIntExtra("imageResourceId", 0);
        String description = intent.getStringExtra("description");
        String timings = intent.getStringExtra("timings");

        ImageView image = (ImageView) findViewById(R.id.image);
        TextView nameTextField = (TextView) findViewById(R.id.name);
        TextView descriptionTextField = (TextView) findViewById(R.id.description_text);
        TextView timingsTextField = (TextView) findViewById(R.id.timings);


        image.setImageResource(imageResourceId);
        nameTextField.setText(name);
        descriptionTextField.setText(description);
        timingsTextField.setText("Timings : " + timings);

    }

}
