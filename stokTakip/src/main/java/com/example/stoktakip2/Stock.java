package com.example.stoktakip2;

import java.io.*;
import java.util.ArrayList;

public class Stock {
    Stock(){}
    ArrayList<Product> items = new  ArrayList<Product>();

    boolean writeFile()throws IOException {
        String file = "stock.txt";
        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(file));
            for(Product e:items){
                writer.write(e.getName()+","+e.getId()+","+e.getFeatures()+","+e.getPrice()+"\n");
            }
            writer.close();
        }
        catch (IOException k){
            return false;
        }
        return true;
    }

    boolean readFile() throws IOException{
        BufferedReader reader = null;
        String line = "";
        String file="stock.txt" ;
        try{
            reader = new BufferedReader(new FileReader(file));
            while((line=reader.readLine())!=null){
                String[] data = line.split(",");
                items.add(new Product(data[0],data[1],data[2],data[3]));
            }
            reader.close();
        }
        catch (IOException k){
            return false;
        }
        return true;
    }

    void addItem(String name, String id, String features, String price){
        items.add(new Product(name,id,features,price));
    }

    boolean removeItem(String id){
        for(Product e: items){
            if(e.getId().equals(id)){
                items.remove(e);
                return true;
            }
        }
        return false;
    }

    Product finditem(String id){
        for(Product e: items){
            if(e.getId().equals(id)){
                return e;
            }
        }
        return null;
    }
}
