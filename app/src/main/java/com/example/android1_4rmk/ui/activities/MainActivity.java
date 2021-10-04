package com.example.android1_4rmk.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android1_4rmk.R;
import com.example.android1_4rmk.ui.fragments.firstFragment.FirstFragment;
import com.example.android1_4rmk.ui.fragments.secondFragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
    }
    private void initFragments() {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment1,new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment2,new SecondFragment() ).commit();
    }
}