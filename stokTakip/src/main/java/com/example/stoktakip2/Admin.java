package com.example.stoktakip2;

public class Admin extends User{
    Admin(){}
    Admin(String username, String password){
        super(username,password);
    }

    String getPassword(){
        return this.password;
    }
    String getUsername(){
        return this.username;
    }
    void setPassword(String password){
        this.password = password;
    }
    void setUsername(String username){
        this.username = username;
    }
}