package com.example.ss82.dto;


import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDTO {
    private Integer id;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 800, message = "Vượt kích thước cho phép")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Không được chứa các kí tự đặc biệt")
    private String songName;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 300, message = "Vượt kích thước cho phép")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Không được chứa các kí tự đặc biệt")
    private String Singer;
    @NotEmpty(message = "Không được để trống")
    @Size(max = 1000, message = "Vượt kích thước cho phép")
    @Pattern(regexp = "^[a-zA-Z0-9 ]+$", message = "Không được chứa các kí tự đặc biệt")
    private String songType;

    public SongDTO() {
    }

    public SongDTO(String songName, String singer, String songType) {
        this.songName = songName;
        Singer = singer;
        this.songType = songType;
    }

    public SongDTO(Integer id, String songName, String singer, String songType) {
        this.id = id;
        this.songName = songName;
        Singer = singer;
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
        return Singer;
    }

    public void setSinger(String singer) {
        Singer = singer;
    }

    public String getSongType() {
        return songType;
    }

    public void setSongType(String songType) {
        this.songType = songType;
    }

}
