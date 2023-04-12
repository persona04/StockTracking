package com.example.stoktakip2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Label message;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button btn;
    @FXML
    private Parent root;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    Admin admin = new Admin("admin","armando");

    @FXML
    protected void login(ActionEvent event) throws IOException {
        if(admin.getUsername().equals(username.getText()) && admin.getPassword().equals(password.getText())){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("menu.fxml"));
            root = loader.load();
            scene = new Scene(root);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setHeight(400);
            stage.setWidth(600);
            stage.show();
        }
        else{
            message.setText("Wrong credentials!");
        }
    }
}