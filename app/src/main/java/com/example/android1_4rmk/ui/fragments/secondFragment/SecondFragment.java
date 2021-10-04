package com.example.android1_4rmk.ui.fragments.secondFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android1_4rmk.R;
import com.example.android1_4rmk.ui.activities.MainActivity2;

import java.util.ArrayList;


public class SecondFragment extends Fragment {

    private RecyclerView recyclerView;
    private ArrayList<Song> list = new ArrayList<>();
    private MusicAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycle(view);
        clickItems();
    }

    private void clickItems() {
        adapter.setInterfaceClick(new MusicAdapter.InterfaceClick() {
            @Override
            public void itemClick(Song song) {
                Intent intent = new Intent(requireActivity(), MainActivity2.class);
                intent.putExtra("key", song);
                startActivity(intent);
            }
        });
    }

    private void initRecycle(View view) {
        recyclerView = view.findViewById(R.id.main_rv);
        adapter = new MusicAdapter();
        adapter.setList(list);
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
        list.add(new Song("1", "Blank Space", "Taylor Swift", "3:22"));
    }


}
