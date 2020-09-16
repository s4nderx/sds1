package com.devsuperior.dspesquisa.dto;

import com.devsuperior.dspesquisa.entities.Record;
import com.devsuperior.dspesquisa.entities.enums.Platform;

import java.time.Instant;

public class RecordDTO {

    private Long id;
    private Instant moment;
    private String name;
    private Integer age;
    private String gameTitle;
    private Platform gamePlataform;
    private String genreName;

    public RecordDTO() {
    }

    public RecordDTO(Record entity) {
        this.id = entity.getId();
        this.moment = entity.getMoment();
        this.name = entity.getName();
        this.age = entity.getAge();
        this.gameTitle = entity.getGame().getTitle();
        this.gamePlataform = entity.getGame().getPlatform();
        this.genreName = entity.getGame().getGenre().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public Platform getGamePlataform() {
        return gamePlataform;
    }

    public void setGamePlataform(Platform gamePlataform) {
        this.gamePlataform = gamePlataform;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
