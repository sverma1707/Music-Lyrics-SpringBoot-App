package com.YSPM_SONGS.organization.controller;

import com.YSPM_SONGS.organization.entity.SongLyric;
import com.YSPM_SONGS.organization.service.impl.SongLyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SongLyricController {

    @Autowired
    private SongLyricService songLyricService;

    @GetMapping("/songs")
    public String home(Model model) {
        List<SongLyric> songLyricList = songLyricService.getAllSongs();
        model.addAttribute("songLyricLists", songLyricList);
        return "home";
    }

    @GetMapping("/songs/{id}")
    public String getSongs(Model model,@PathVariable("id") Integer songID){
        SongLyric lyric = songLyricService.getSongsById(songID);
        model.addAttribute("songLyric", lyric);
        return "song_lyric";
    }

}

