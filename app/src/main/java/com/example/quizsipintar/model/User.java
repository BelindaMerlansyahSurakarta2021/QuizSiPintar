package com.example.quizsipintar.model;

public class User {
    private String id, name;

    public  User(String name){
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public  void  setName(){
        this.name = name;
    }
}