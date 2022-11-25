package com.example.multiscenedemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private static Stage window;

    private void setPrimaryStage(Stage stage) {
        this.window = stage;
    }

    public Stage getPrimaryStage() {
        return this.window;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view1.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);

        setPrimaryStage(stage);
        stage.setTitle("Home");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}