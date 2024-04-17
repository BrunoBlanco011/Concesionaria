package com.brunoblanco.concesionariovehiculos;

import Controllers.MenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public Main(){

    }
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("menu.fxml"));
        Scene scene = new Scene((Parent)fxmlLoader.load() );
        stage.setTitle("Concesionaria");
        stage.setScene(scene);
        stage.show();
        MenuController menuController = fxmlLoader.getController();
        menuController.setStage(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}