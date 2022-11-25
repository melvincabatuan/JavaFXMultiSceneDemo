package com.example.multiscenedemo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController1 {


    @FXML
    private TextField homeIdField;

    @FXML
    private TextField homeNameField;

    @FXML
    protected void onChangeButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view2.fxml"));
        Parent root = loader.load();
        HelloController2 controller2 = loader.getController();
        controller2.showInformation(homeNameField.getText(), homeIdField.getText());

        Stage window = new Stage();
        window.setScene(new Scene(root));
        window.setTitle("Scene 2");
        window.show();
    }

    public void showInformation(String name, String id) {
        homeNameField.setText(name);
        homeIdField.setText(id);
    }
}