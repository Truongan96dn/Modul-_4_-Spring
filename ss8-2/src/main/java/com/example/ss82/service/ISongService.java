package com.example.ss82.service;

import com.example.ss82.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    Song findById(int id);
    void save(Song song);

}
