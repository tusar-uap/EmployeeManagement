package com.uap.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

import static com.uap.constant.ManagemantContants.MAIN_FRAME;

public class ManagementApplication extends Application {
    private static final String PROJECT_TITLE = "Employee Management System";
    @Override
    public void start(Stage mainStage) throws IOException {
        Scene mainScene = new Scene(new Label(), MAIN_FRAME.getWidth(), MAIN_FRAME.getHeight());
        mainStage.setTitle(PROJECT_TITLE);
        mainStage.setScene(mainScene);
        mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}