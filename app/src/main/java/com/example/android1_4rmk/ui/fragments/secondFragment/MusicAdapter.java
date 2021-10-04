package com.example.android1_4rmk.ui.fragments.secondFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android1_4rmk.R;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.ViewHolder> {

    private ArrayList<Song> list = new ArrayList<>();
    private InterfaceClick interfaceClick;

    public void setInterfaceClick(InterfaceClick interfaceClick) {
        this.interfaceClick = interfaceClick;
    }

    public void setList(ArrayList<Song> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView position, song_title, singer, duration;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            position = itemView.findViewById(R.id.position);
            song_title = itemView.findViewById(R.id.song_title);
            singer = itemView.findViewById(R.id.singer);
            duration = itemView.findViewById(R.id.duration);
        }

        public void onBind(Song song) {

            position.setText(song.getPosition());
            singer.setText(song.getSinger());
            song_title.setText(song.getTitle());
            duration.setText(song.getDuration());

            itemView.setOnClickListener(view -> {
                interfaceClick.itemClick(song);
            });
        }
    }

    public interface InterfaceClick {
        void itemClick(Song song);
    }
}

