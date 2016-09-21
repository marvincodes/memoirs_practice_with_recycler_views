package com.example.matthewtaila.memoirs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.matthewtaila.memoirs.Model.Album;

public class CreateAlbumActivity extends AppCompatActivity implements View.OnClickListener {

    // UI
    EditText albumTitleStore;
    Button buttonTitleStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_album);
        albumTitleStore = (EditText) findViewById(R.id.et_createAlbumTitle);
        buttonTitleStore = (Button) findViewById(R.id.btn_storeAlbumTitle);
        buttonTitleStore.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_storeAlbumTitle:
                storeAlbum();
                break;
        }
    }

    private void storeAlbum() {
        String albumTitle = albumTitleStore.getText().toString();
        Album album = new Album();
        album.setTitle(albumTitle);
        Log.i("Test input", album.getTitle());
    }
}
