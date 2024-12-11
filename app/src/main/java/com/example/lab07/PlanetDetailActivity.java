package com.example.lab07;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PlanetDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet_detail);

        ImageView imageViewDetail = findViewById(R.id.imageViewDetail);
        TextView textViewName = findViewById(R.id.textViewNameDetail);
        TextView textViewMass = findViewById(R.id.textViewMass);
        TextView textViewRevolutionPeriod = findViewById(R.id.textViewRevolutionPeriod);
        TextView textViewNumberOfMoons = findViewById(R.id.textViewNumberOfMoons);

        Planet planet = getIntent().getParcelableExtra("planet");

        if (planet != null) {
            imageViewDetail.setImageResource(planet.getImageResId());
            textViewName.setText(planet.getName());
            textViewMass.setText("Mass: " + planet.getMass());
            textViewRevolutionPeriod.setText("Revolution Period: " + planet.getRevolutionPeriod());
            textViewNumberOfMoons.setText("Moons: " + planet.getNumberOfMoons());
        }

    }
}

