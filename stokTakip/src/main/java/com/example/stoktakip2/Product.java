package com.example.stoktakip2;

public class Product {
    private String name;
    private String id;
    private String features;
    private String price;

    Product(){}
    Product(String name, String id, String features, String price){
        this.name = name;
        this.id = id;
        this.features = features;
        this.price = price;
    }


    String getName(){
        return this.name;
    }
    String getId(){
        return this.id;
    }
    String getFeatures(){
        return this.features;
    }
    String getPrice(){
        return this.price;
    }
    void setName(String name){
        this.name = name;
    }
    void setId(String id){
        this.id = id;
    }
    void setFeatures(String features){
        this.features = features;
    }
    void setPrice(String price){
        this.price = price;
    }
}
