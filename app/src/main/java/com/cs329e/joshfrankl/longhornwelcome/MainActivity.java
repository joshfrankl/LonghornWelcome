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
    private String[] actions = { "Select an option", "Introduction Video", "Play Texas Fight", "Perry-Castañeda Library", "Flawn Academic Center", "Darrell K. Royal-Texas Memorial Stadium", "Places to Eat"};
    private final String pclDescription = "The Perry-Castañeda Library (PCL) is The University of Texas at Austin's main research library.  It embraces all subject fields, with the strongest holdings in the humanities, social sciences, business, and education.  Open to everyone, we welcome your visit!";
    private final String facDescription = "The Peter T. Flawn Academic Center (formerly the Undergraduate Library and Academic Center) is an undergraduate library and \"technology and collaboration\" facility located on The University of Texas at Austin campus. The center, named after former university president Peter T. Flawn in 1983, opened between 1963 and 1964. Upon its opening, the building featured the first open-stack library on campus for undergraduates along with much of the Humanities Research Center.";
    private final String dkrDescription = "Darrell K. Royal–Texas Memorial Stadium (formerly War Memorial Stadium, Memorial Stadium, and Texas Memorial Stadium), located in Austin, Texas, has been home to the University of Texas at Austin Longhorns football team since 1924. The stadium has delivered a great home field advantage with the team's home record through the 2015 season being 362–108–10 (76.5%). The current official stadium seating capacity of 100,119 makes the stadium the second largest stadium in the state of Texas, the largest in the Big 12 Conference, the ninth largest stadium in the United States, and the twelfth largest stadium in the world.";

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

        if (position == 1) { // Introduction Video
            Intent intent = new Intent(this, VideoActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }
        if (position == 2) { // Play Texas Fight
            Intent intent = new Intent(this, FightSongActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }
        else if (position == 3) { // PCL
            Intent intent = new Intent(this, KeyBuildingsActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            intent.putExtra("title", "Perry-Castañeda Library (PCL)");
            intent.putExtra("description", pclDescription);
            startActivity(intent);
        }
        else if (position == 4) { // FAC
            Intent intent = new Intent(this, KeyBuildingsActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            intent.putExtra("title", "Flawn Academic Center (FAC)");
            intent.putExtra("description", facDescription);
            startActivity(intent);
        } else if (position == 5) { // DKR
            Intent intent = new Intent(this, KeyBuildingsActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            intent.putExtra("title", "Darrell K. Royal-Texas Memorial Stadium (DKR)");
            intent.putExtra("description", dkrDescription);
            startActivity(intent);
        }
        else if (position == 6) { // Places to Eat
            Intent intent = new Intent(this, MapsActivity.class);
            spinner.setSelection(0); // Reset the spinner for future use
            startActivity(intent);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // Auto-generated method stub

    }
}
