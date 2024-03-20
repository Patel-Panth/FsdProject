package com.example.apirest.entities.Courses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Courses {
    @Id
    private long id;
    private String title;
    private  String description;
    public Courses(long id,String title,String description){
        super();
        this.id=id;
        this.title=title;
        this.description=description;
    }

    public Courses() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   }
