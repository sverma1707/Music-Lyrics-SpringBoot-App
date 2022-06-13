package com.YSPM_SONGS.organization.controller;

import com.YSPM_SONGS.organization.entity.SongLyric;
import com.YSPM_SONGS.organization.service.impl.SongLyricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

class Query{
    public String queryName;
}

@Controller
public class SongLyricController {

    @Autowired
    private SongLyricService songLyricService;



//    @GetMapping("/songs")
//    public List<SongLyric> getAllSongs() {
//        return songLyricService.getAllSongs();
//    }
//
//    @GetMapping("/songs/{id}")
//    public SongLyric getSongsById(@PathVariable("id") Integer id) {
//        return songLyricService.getSongsById(id);
//    }


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

//    @PostMapping("/songs/query")
//    public String searchSongs(Model model, @ModelAttribute Query query){
//        List<SongLyric> songLyricList = songLyricService.getAllSongs();
//        int index = 0;
//        String search = query;
//        for(SongLyric song: songLyricList) {
//            if(song.title.trim().contains(search))
//                model.addAttribute("song", song);
//                return "home";
//        }
//        model.addAttribute("song", "NIL");
//        return "home";
//
//
//    }

//
//    @GetMapping("/songs/create")
//    public String createSongsPage(Model model) {
//        SongLyric songLyric = new SongLyric();
//        model.addAttribute("songLyrics", songLyric);
//        return "create_song";
//    }

}

