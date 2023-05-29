package com.example.ss82.controller;

import com.example.ss82.dto.SongDTO;
import com.example.ss82.model.Song;
import com.example.ss82.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    @Autowired
    private ISongService iSongService;

    @GetMapping("/")
    public String showListMusic(Model model) {
        model.addAttribute("songList", iSongService.findAll());
        return "song-list";
    }

    @GetMapping("/create")
    public String showFormCreateMusic(Model model) {
        model.addAttribute("song", new SongDTO());
        return "create";
    }

    @GetMapping("/update/{id}")
    public String showFormUpdateMusic(@PathVariable int id, Model model) {
        model.addAttribute("song", iSongService.findById(id));
        return "update";
    }
    @PostMapping("/save-music")
    public String saveMusic(@Validated @ModelAttribute(value = "song") SongDTO songDTO, BindingResult bindingResult , Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("song" ,songDTO );
            return "create";
        }else{
            Song song = new Song();
            BeanUtils.copyProperties(songDTO,song);
            iSongService.save(song);
        }

        return "redirect:/";
    }

}
