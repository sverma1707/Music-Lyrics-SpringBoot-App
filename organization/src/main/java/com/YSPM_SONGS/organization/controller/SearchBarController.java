package com.YSPM_SONGS.organization.controller;

import com.YSPM_SONGS.organization.entity.SongLyric;
import com.YSPM_SONGS.organization.service.impl.SongLyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SearchBarController {

    @Autowired
    private SongLyricService songLyricService;

    @GetMapping("/saved")
    public String add(Model model) {
        List<SongLyric> songLyricList = songLyricService.getAllSongs();
        model.addAttribute("songLyricLists", songLyricList);
        List<SongLyric> listSongs = songLyricService.getAllSongs();
        model.addAttribute("songs", new SongLyric());
//        List<SongLyric> listout = songLyricService.getAllSongs();
//        model.addAttribute("songss", new SongLyric());

        return "song_lyric";
    }


    @PostMapping("/searches")
    public String doSearchEmployee(@ModelAttribute("employeeSearchFormData") SongLyric formData, Model model) {
        SongLyric emp = songLyricService.getSongsById(formData.getId());
        model.addAttribute("songs", emp);
        return "song_lyric";
    }

}
