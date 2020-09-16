package com.devsuperior.dspesquisa.dto;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

import java.io.Serializable;

public class GameDTO implements Serializable {
    private static final long serialVersionUID = -7707133371470897215L;

    private Long id;
    private String title;
    private Platform platform;

    public GameDTO(){

    }

    public GameDTO(Game enity){
        this.id = enity.getId();
        this.title = enity.getTitle();
        this.platform = enity.getPlatform();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
}
