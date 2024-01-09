package fr.angers.poo;

import fr.angers.poo.volaille.Elevage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * classe principale permettant de lancer l'application
 */
public class MainApp extends Application {

    /**
     * Lance la methode showMenuPrincipale pour afficher la page principale
     * @param primaryStage
     * @throws IOException
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        showMenuPrincipale(primaryStage);
    }

    /**
     * Lance automatiquement la methode start
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Affiche la page principale récupéré dans le dossier fxml
     * @param primaryStage
     * @throws IOException
     */
    public static void showMenuPrincipale(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("menu-principale-vue.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        primaryStage.setTitle("Menu Principal");
        primaryStage.setScene(scene);

        // Récupérez le contrôleur de la vue
        MenuPrincipaleController controller = loader.getController();
        // Vous pouvez initialiser le contrôleur si nécessaire

        primaryStage.show();
    }
}
