package com.YSPM_SONGS.organization.service.impl;

import com.YSPM_SONGS.organization.entity.SongLyric;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SongLyricService {

    List<SongLyric> getAllSongs();

    SongLyric getSongsById(Integer id);

//    Integer getSongByString(String search);
}
