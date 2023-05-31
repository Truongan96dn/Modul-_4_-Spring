package com.example.ss82.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String songName;
    private String singer;
    private String songType;

    public Song() {
    }

    public Song(String songName, String singer, String songType) {
        this.songName = songName;
        this.singer = singer;
        this.songType = songType;
    }

    public Song(Integer id, String songName, String singer, String songType) {
        this.id = id;
        this.songName = songName;
        this.singer = singer;
        this.songType = songType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongType() {
        return songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }

}
