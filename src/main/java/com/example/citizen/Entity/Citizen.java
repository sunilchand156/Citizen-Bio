package com.example.citizen.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "citizen")
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String aadharId;
    private String panId;
    private String name;

    public Citizen() {
    }

    public Citizen(long id, String aadharId, String panId, String name) {
        this.id = id;
        this.aadharId = aadharId;
        this.panId = panId;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAadharId() {
        return aadharId;
    }

    public void setAadharId(String aadharId) {
        this.aadharId = aadharId;
    }

    public String getPanId() {
        return panId;
    }

    public void setPanId(String panId) {
        this.panId = panId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

