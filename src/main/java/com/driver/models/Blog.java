package com.driver.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class Blog {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id ;

    private String title ;
    private String content ;

    public Blog(User id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @ManyToOne
    @JoinColumn
    private User user ;

    @OneToMany(mappedBy = "blog",cascade =  CascadeType.ALL)
     private  List<Image> imageList = new ArrayList<>() ;

    public List<Image> getImageList() {
        return imageList;
    }

    public void setImageList(List<Image> imageList) {
        this.imageList = imageList;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Blog() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}