package com.driver.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private String username ;
    private String password ;

    private String  firstName = "test" ;
    private String lastName = "test" ;

    public User(int id, String username, String password, String name, String lastname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = name;
        this.lastName = lastname;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Blog> blogList = new ArrayList<>() ;

    public List<Blog> getBlogList() {
        return blogList;
    }

    public void setBlogList(List<Blog> blogList) {
        this.blogList = blogList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return firstName ;
    }

    public void setName(String name) {
        this.firstName = firstName ;
    }

    public String getLastname() {
        return lastName ;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname ;
    }

    public User() {
    }
}