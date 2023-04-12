package com.example.stoktakip2;

import java.io.IOException;

public class test {
    public static void main(String[] args){
        Stock stok = new Stock();
        stok.addItem("m","ir","za","mna");
        try{
            stok.readFile();
        }
        catch (IOException e){

        }
        for(Product e: stok.items){
            System.out.println(e.getFeatures());
        }
    }
}
