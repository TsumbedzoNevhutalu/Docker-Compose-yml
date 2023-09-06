package com.example.dockercompose.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;

    public Post(){}

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }
    public Long getId(){
        return id;
    }
    public void setId( Long Id){
        this.id = id;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(){
        this.title = title;
    }

    public String getBody(){
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }

    public void  setBody(){
        this.body = body;
    }
}
