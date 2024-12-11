package com.example.lab07;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder> {

    private Context context;
    private List<Planet> planetList;
    public PlanetAdapter(Context context, List<Planet> planetList) {
        this.context = context;
        this.planetList = planetList;
    }
    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_planet, parent, false);
        return new PlanetViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet planet = planetList.get(position); // Obtenez la planète à la position actuelle
        holder.imageViewPlanet.setImageResource(planet.getImageResId());
        holder.textViewName.setText(planet.getName());
        holder.textViewDistance.setText(planet.getDistanceFromSun());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, PlanetDetailActivity.class);
            intent.putExtra("planet", planet); // Passez l'objet Planet
            context.startActivity(intent);
        });
    }
    @Override
    public int getItemCount() {
        return planetList.size();
    }

    static class PlanetViewHolder extends RecyclerView.ViewHolder {
        ImageView imageViewPlanet;
        TextView textViewName, textViewDistance;

        public PlanetViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPlanet = itemView.findViewById(R.id.imageViewPlanet);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewDistance = itemView.findViewById(R.id.textViewDistance);
        }
    }
}

