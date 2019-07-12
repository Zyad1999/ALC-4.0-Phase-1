package com.example.android.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView image = findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.photo);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int Id = item.getItemId();

        if(Id == android.R.id.home)
            this.finish();

        return super.onOptionsItemSelected(item);
    }
}
