package com.example.lab07;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewPlanets);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", R.drawable.mercury, "57.91 million km", "3.3 × 10^23 kg", "88 days", 0));
        planets.add(new Planet("Venus", R.drawable.venus, "108.2 million km", "4.87 × 10^24 kg", "225 days", 0));
        planets.add(new Planet("Earth", R.drawable.earth, "149.6 million km", "5.97 × 10^24 kg", "365 days", 1));
        planets.add(new Planet("Mars", R.drawable.mars, "227.9 million km", "6.42 × 10^23 kg", "687 days", 2));
        planets.add(new Planet("Jupiter", R.drawable.jupiter, "778.5 million km", "1.90 × 10^27 kg", "4,333 days", 79));
        planets.add(new Planet("Saturn", R.drawable.saturn, "1.43 billion km", "5.68 × 10^26 kg", "10,759 days", 83));
        planets.add(new Planet("Uranus", R.drawable.uranus, "2.87 billion km", "8.68 × 10^25 kg", "30,687 days", 27));
        planets.add(new Planet("Neptune", R.drawable.neptune, "4.50 billion km", "1.02 × 10^26 kg", "60,190 days", 14));

        PlanetAdapter adapter = new PlanetAdapter(this, planets);
        recyclerView.setAdapter(adapter);
    }
}

