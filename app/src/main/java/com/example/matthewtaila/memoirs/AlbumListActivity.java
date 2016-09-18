package com.example.matthewtaila.memoirs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.matthewtaila.memoirs.Model.Album;

import java.util.ArrayList;

public class AlbumListActivity extends AppCompatActivity {

    // - Logic
    ArrayList<Album> albumArrayList;
    AlbumAdapter albumAdapter;

    // - UI
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_list);
        recyclerView = (RecyclerView)findViewById(R.id.rv_albumList);
        albumArrayList = new ArrayList<>();
        createStubAlbumData();
        setupAlbumRecyclerView();
    }

    private void setupAlbumRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        albumAdapter = new AlbumAdapter(albumArrayList, this);
        recyclerView.setAdapter(albumAdapter);
    }

    private void createStubAlbumData() {
        Album album;
        for (int i = 0; i < 10; i++){
            album = new Album();
            album.setTitle("Album number: " + i);
            albumArrayList.add(album);
        }
    }


}
