package com.example.recycleview_event;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AnimeAdapter animeAdapter;
    private List<Anime> animeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        setupRecyclerView();
    }

    private void initData() {
        animeList = new ArrayList<>();

        // Thêm dữ liệu anime (bạn có thể thay thế bằng ảnh thật)
        animeList.add(new Anime("Naruto", "Câu chuyện về ninja trẻ Naruto Uzumaki", R.drawable.ic_launcher_foreground));
        animeList.add(new Anime("One Piece", "Cuộc phiêu lưu của Luffy và băng hải tặc Mũ Rơm", R.drawable.ic_launcher_foreground));
        animeList.add(new Anime("Attack on Titan", "Cuộc chiến chống lại Titan khổng lồ", R.drawable.ic_launcher_foreground));
        animeList.add(new Anime("My Hero Academia", "Thế giới của những siêu anh hùng", R.drawable.ic_launcher_foreground));
        animeList.add(new Anime("Demon Slayer", "Hành trình tiêu diệt quỷ của Tanjiro", R.drawable.ic_launcher_foreground));
    }

    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        animeAdapter = new AnimeAdapter(animeList);
        recyclerView.setAdapter(animeAdapter);
    }
}