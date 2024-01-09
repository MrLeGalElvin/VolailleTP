package fr.angers.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        showLoginScene(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void showLoginScene(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(MainApp.class.getResource("login-vue.fxml")));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Page de Connexion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void showCanardScene(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(MainApp.class.getResource("canard-vue.fxml")));

        Scene scene = new Scene(root);
        primaryStage.setTitle("Gestion des Canards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}