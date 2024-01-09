package fr.angers.poo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin() {
        // Code de gestion de la connexion ici
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Ajoutez votre logique de connexion ici
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        try {
            MainApp.showCanardScene((Stage) loginButton.getScene().getWindow());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
