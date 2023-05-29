package com.example.ss82.service.impl;

import com.example.ss82.model.Song;
import com.example.ss82.repository.ISongRepo;
import com.example.ss82.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements ISongService {
    @Autowired
    private ISongRepo iSongRepo;
    @Override
    public List<Song> findAll() {
        return iSongRepo.findAll();
    }

    @Override
    public Song findById(int id) {
        return iSongRepo.findById(id).get();
    }

    @Override
    public void save(Song song) {
        iSongRepo.save(song);

    }
}
