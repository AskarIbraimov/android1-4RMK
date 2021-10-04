package com.example.android1_4rmk.ui.fragments.secondFragment;

import java.io.Serializable;

public class Song implements Serializable {
    private String position,title,singer,duration;

    public Song(String position, String title, String singer, String duration) {
        this.position = position;
        this.title = title;
        this.singer = singer;
        this.duration = duration;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public String getDuration() {
        return duration;
    }
}
