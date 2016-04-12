package com.cs329e.joshfrankl.longhornwelcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class KeyBuildingsActivity extends AppCompatActivity {

    private ImageView buildingImage;
    private TextView buildingTitle;
    private TextView buildingDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_buildings);

        buildingImage = (ImageView) findViewById(R.id.buildingImage);
        buildingTitle = (TextView) findViewById(R.id.buildingTitle);
        buildingDescription = (TextView) findViewById(R.id.buildingDescription);

        // Get data from the intent
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");

        // Set properties from intent
        buildingTitle.setText(title);
        buildingDescription.setText(description);

        if (title.equals("Perry-Castañeda Library (PCL)")) {
            buildingImage.setImageResource(R.drawable.pcl);
        }
        if (title.equals("Flawn Academic Center (FAC)")) {
            buildingImage.setImageResource(R.drawable.fac);
        }
        if (title.equals("Darrell K. Royal-Texas Memorial Stadium (DKR)")) {
            buildingImage.setImageResource(R.drawable.dkr);
        }
    }
}
