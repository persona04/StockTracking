package com.example.stoktakip2;

public abstract class User {
    String password;
    String username;
    User(){}
    User(String username,String password){
        this.password = password;
        this.username = username;
    }
    abstract void setUsername(String username);

    abstract void setPassword(String password);

    abstract String getPassword();

    abstract String  getUsername();
}
