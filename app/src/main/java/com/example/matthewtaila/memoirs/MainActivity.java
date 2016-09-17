package com.example.matthewtaila.memoirs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // - UI
    Button logInActivity;
    Button albumListActivity;
    Button pictureListActivity;
    Button createAlbumActivity;
    Button pictureActivity;
    Button editAlbumActivity;
    Button editPictureActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenceViews();
    }

    private void referenceViews() {

        // - Navigation buttons
        logInActivity = (Button)findViewById(R.id.btn_loginActivity);
        albumListActivity = (Button)findViewById(R.id.btn_albumListActivity);
        pictureListActivity = (Button)findViewById(R.id.btn_pictureListActivity);
        createAlbumActivity = (Button)findViewById(R.id.btn_createAlbumActivity);
        pictureActivity = (Button)findViewById(R.id.btn_pictureActivity);
        editAlbumActivity = (Button)findViewById(R.id.btn_editAlbumActivity);
        editPictureActivity = (Button)findViewById(R.id.btn_editPictureActivity);

        // - onClickListener
        logInActivity.setOnClickListener(this);
        albumListActivity.setOnClickListener(this);
        pictureListActivity.setOnClickListener(this);
        createAlbumActivity.setOnClickListener(this);
        pictureActivity.setOnClickListener(this);
        editAlbumActivity.setOnClickListener(this);
        editPictureActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.btn_albumListActivity:
                intent = new Intent(this, AlbumListActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_loginActivity:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_pictureListActivity:
                intent = new Intent(this, PictureListActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_createAlbumActivity:
                intent = new Intent(this, CreateAlbumActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_pictureActivity:
                intent = new Intent(this,PictureActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_editAlbumActivity:
                intent = new Intent(this,EditAlbumActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_editPictureActivity:
                intent = new Intent(this,EditPictureActivity.class);
                startActivity(intent);
                break;
        }
    }
}
