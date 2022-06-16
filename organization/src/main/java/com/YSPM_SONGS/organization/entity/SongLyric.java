package com.YSPM_SONGS.organization.entity;

import javax.persistence.*;

@Entity
@Table(name="songlyrics")
public class SongLyric {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title",nullable = false)
    private String title;

    @Column(name="songlyric", nullable=false)
    private String songlyric;


    public String getSonglyric() {
        return songlyric;
    }

    public void setSonglyric(String songlyric) {
        this.songlyric = songlyric;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SongLyric() {
    }

    public SongLyric(Integer id, String title, String songlyric) {
        this.id = id;
        this.title = title;
        this.songlyric = songlyric;
    }

}
