package com.YSPM_SONGS.organization.service.impl;

import com.YSPM_SONGS.organization.entity.SongLyric;
import com.YSPM_SONGS.organization.repository.SongLyricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongLyricServiceImpl implements SongLyricService {

    @Autowired
    private SongLyricRepository songLyricRepository;


    @Override
    public List<SongLyric> getAllSongs() {
        return songLyricRepository.findAll();
    }

    @Override
    public SongLyric getSongsById(Integer id) {
        return songLyricRepository.findById(id).get();
    }

}
