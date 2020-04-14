package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private  ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvEmployees);
        imageAdapter = new ImageAdapter(ImageList.createImages());

        // The recycler view asks two questions:

        // What do I look like?
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Who is my adapter?
        recyclerView.setAdapter(imageAdapter);

/*        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(recyclerView.getContext(),
                        DividerItemDecoration.VERTICAL);

        recyclerView.addItemDecoration(dividerItemDecoration);*/


    }
}
