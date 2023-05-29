package com.example.ss82.repository;

import com.example.ss82.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ISongRepo extends JpaRepository<Song,Integer> {
}
