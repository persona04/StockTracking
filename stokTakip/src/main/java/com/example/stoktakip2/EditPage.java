package com.example.stoktakip2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class EditPage {
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;

    @FXML
    private TextField name;
    @FXML
    private TextField id;
    @FXML
    private TextField features;
    @FXML
    private TextField price;
    @FXML
    private TextField findId;
    @FXML
    private Label message;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnRemove;

    @FXML
    protected void add() throws IOException {
        Stock stok = new Stock();
        try{
            stok.readFile();
        }
        catch (IOException k){
            message.setText("Something wents wrong.");
        }
        stok.addItem(name.getText(),id.getText(),features.getText(),price.getText());
        try{
            stok.writeFile();
        }
        catch (IOException k){
            message.setText("Something wents wrong!");
        }
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
    @FXML
    protected void remove(ActionEvent event) throws IOException{
        Stock stok = new Stock();
        try{
            stok.readFile();
            stok.removeItem(findId.getText());
            stok.writeFile();
        }
        catch (IOException k){
            message.setText("Something wents wrong!");
        }
    }
}