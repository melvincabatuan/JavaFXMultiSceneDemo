package com.example.multiscenedemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController2 {

    @FXML
    private TextField scene2IdField;

    @FXML
    private TextField scene2NameField;


    @FXML
    protected void onChangeButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view3.fxml"));
        Parent root = loader.load();
        HelloController3 controller3 = loader.getController();
        controller3.showInformation(scene2NameField.getText(), scene2IdField.getText());

        Stage window = new Stage();
        window.setScene(new Scene(root));
        window.setTitle("Scene 2");
        window.show();
    }

    public void showInformation(String name, String id) {
        scene2NameField.setText(name);
        scene2IdField.setText(id);
    }
}