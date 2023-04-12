package com.example.stoktakip2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

import java.io.IOException;

public class ListPage {
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Button btnBack;
    @FXML
    private Label list;
    @FXML
    private Label message;

    @FXML
    protected void listItems() throws IOException{
        Stock stok = new Stock();
        try {
            stok.readFile();
        }
        catch (IOException k){
            message.setText("Something wents wrong!");
        }
        String listString = "\n    ITEM LIST\n\n";
        for(Product e:stok.items){
            listString = listString +"    Name: "+e.getName()+"    "+"ID: "+e.getId()+"    "+"Price: "+e.getPrice()+"\n    Features: "+e.getFeatures()+"\n\n";
        }
        list.setText(listString);
    }

    @FXML
    protected void back(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setWidth(600);
        stage.setHeight(400);
        stage.setTitle("Menu");
        stage.show();
    }
}
