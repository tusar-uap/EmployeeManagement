package com.uap.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagementApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        var lebel = new Label("Abdullah");
        Scene scene = new Scene(lebel, 800, 640);
        stage.setTitle("Tusar!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}