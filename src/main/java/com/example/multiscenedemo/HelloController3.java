package com.example.multiscenedemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController3 {

    @FXML
    private TextField scene3IdField;

    @FXML
    private TextField scene3NameField;



    public void onChangeButtonClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view1.fxml"));

        Parent root = loader.load();
        HelloController1 controller1 = loader.getController();
        controller1.showInformation(scene3NameField.getText(), scene3IdField.getText());

//        Stage window = (Stage)((Node) event.getSource()).getScene().getWindow(); // gets the current window
        HelloApplication app = new HelloApplication();
        Stage window = app.getPrimaryStage();
        window.setScene(new Scene(root));
        window.setTitle("Scene 2");
        window.show();
    }


    public void showInformation(String name, String id) {
        scene3NameField.setText(name);
        scene3IdField.setText(id);
    }

}