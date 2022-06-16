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

//    @GetMapping("/songs")
//    public String home(Model model) {
//        List<SongLyric> songLyricList = songLyricService.getAllSongs();
//        model.addAttribute("songLyricLists", songLyricList);
//        return "home";
//    }

    @GetMapping("/songs/{id}")
    public String getSongs(Model model,@PathVariable("id") Integer songID){
        SongLyric lyric = songLyricService.getSongsById(songID);
        model.addAttribute("songLyric", lyric);
        return "song_lyric";
    }


    @GetMapping("/save")
    public String add(Model model) {
        List<SongLyric> listSongs = songLyricService.getAllSongs();
        List<SongLyric> songLyricList = songLyricService.getAllSongs();
        model.addAttribute("songLyricLists", songLyricList);
        model.addAttribute("song", new SongLyric());
        return "home";
    }

//    @GetMapping("/saves")
//    public String hello(Model model) {
//        List<SongLyric> listSongs = songLyricService.getAllSongs();
//        List<SongLyric> songLyricList = songLyricService.getAllSongs();
//        model.addAttribute("songLyricLists", songLyricList);
//        model.addAttribute("song", new SongLyric());
//        return "song_lyric";
//    }


    @PostMapping("/search")
    public String doSearchEmployee(@ModelAttribute("employeeSearchFormData") SongLyric formData, Model model) {
        SongLyric emp = songLyricService.getSongsById(formData.getId());
        model.addAttribute("song", emp);
        return "home";
    }

}

