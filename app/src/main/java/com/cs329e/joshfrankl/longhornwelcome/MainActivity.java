package com.cs329e.joshfrankl.longhornwelcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner;
    private String[] actions = { "Select an option", "Introduction Video", "Play Texas Fight", "Key Buildings", "Places to Eat"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapter_actions = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, actions);
        adapter_actions.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter_actions);
        spinner.setOnItemSelectedListener(this);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        spinner.setSelection(position);
        String selAction = (String) spinner.getSelectedItem();

        /*if (position == 1) { // Introduction Video
            Intent intent = new Intent(this, VideoActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }*/
        if (position == 2) { // Play Texas Fight
            Intent intent = new Intent(this, FightSongActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }
        /*else if (position == 3) { // Key Buildings
            Intent intent = new Intent(this, KeyBuildingsActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }
        else if (position == 4) { // Places to Eat
            Intent intent = new Intent(this, PlacesToEatActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }*/
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // Auto-generated method stub

    }
}
