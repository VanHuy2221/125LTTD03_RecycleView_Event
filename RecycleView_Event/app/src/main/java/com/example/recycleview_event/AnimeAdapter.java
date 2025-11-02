package com.example.recycleview_event;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {

    private List<Anime> animeList;

    public AnimeAdapter(List<Anime> animeList) {
        this.animeList = animeList;
    }

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_anime, parent, false);
        return new AnimeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeViewHolder holder, int position) {
        Anime anime = animeList.get(position);

        holder.textViewTitle.setText(anime.getTitle());
        holder.textViewDescription.setText(anime.getDescription());
        holder.imageViewAnime.setImageResource(anime.getImageResource());

        // Event click cho item
        holder.itemView.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),
                    "Bạn đã chọn: " + anime.getTitle(),
                    Toast.LENGTH_SHORT).show();
        });

        // Event click cho button
        holder.buttonWatch.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),
                    "Bắt đầu xem: " + anime.getTitle(),
                    Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public int getItemCount() {
        return animeList.size();
    }

    public static class AnimeViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageViewAnime;
        public TextView textViewTitle;
        public TextView textViewDescription;
        public Button buttonWatch;

        public AnimeViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewAnime = itemView.findViewById(R.id.imageViewAnime);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
            buttonWatch = itemView.findViewById(R.id.buttonWatch);
        }
    }
}
