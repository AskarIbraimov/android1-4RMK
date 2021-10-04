package com.example.android1_4rmk.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.android1_4rmk.R;
import com.example.android1_4rmk.ui.fragments.secondFragment.Song;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView result = findViewById(R.id.result_text);

        Song song = (Song) getIntent().getSerializableExtra("key");

        result.setText(song.getTitle());

    }
}