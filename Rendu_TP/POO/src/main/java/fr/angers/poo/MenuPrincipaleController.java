package fr.angers.poo;

import fr.angers.poo.volaille.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class MenuPrincipaleController {

    @FXML
    private VBox ajoutSection;

    @FXML
    private VBox affichageSection;

    @FXML
    private VBox prixSection;

    @FXML
    private ComboBox<String> choixAction;

    @FXML
    private ComboBox<String> choixAjout;

    @FXML
    private ComboBox<String> choixAff;

    @FXML
    private ComboBox<String> choixPrix;

    @FXML
    private TextField poidsField;

    @FXML
    private TextField quantiteField;

    @FXML
    private CheckBox enDessousCheckBox;

    @FXML
    private TextField prixKgField;

    @FXML
    private VBox poidsAbattageSection;

    @FXML
    private ComboBox<String> choixAbattage;

    @FXML
    private TextField poidsAbattageField;
    private Elevage elevage;
    private ObservableList<Volaille> volailles = FXCollections.observableArrayList();
    public void initialize() {
        // Bind the visibility of sections to the selected choice in ChoixAction
        this.elevage = new Elevage();

        ajoutSection.visibleProperty().bind(choixAction.valueProperty().isEqualTo("Ajouter"));
        affichageSection.visibleProperty().bind(choixAction.valueProperty().isEqualTo("Afficher"));
        prixSection.visibleProperty().bind(choixAction.valueProperty().isEqualTo("Modifier Prix/kg"));
        poidsAbattageSection.visibleProperty().bind(choixAction.valueProperty().isEqualTo("Modifier Poids Abattage"));
    }

    @FXML
    private void ajouterVolaille() {
        String type = choixAjout.getValue().toString();
        System.out.println(type);
        double poids = Double.parseDouble(poidsField.getText());
        int quantite = Integer.parseInt(quantiteField.getText());
        System.out.println(type.equals("Poulet"));

        if (type.equals("Poulet")) {
            for(int i = 0; i < quantite; ++i) {
                System.out.println(type);
                this.elevage.addVolaille(new Poulet(poids));
                this.elevage.ecrire();
            }
        } else {
            for(int i = 0; i < quantite; ++i) {
                this.elevage.addVolaille(new Canard(poids));
            }
        }
    }

    @FXML
    private void afficherVolaille() {
        TableView<Volaille> tableView = new TableView<>();
        tableView.setItems(volailles);
        String type = choixAff.getValue();
        boolean enDessous = enDessousCheckBox.isSelected();

        List<Volaille> volaillesx = elevage.getVolaille();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/volaille/elevage.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Liste");
        try {
            Parent root = loader.load();
            ElevageController elevageController = loader.getController();
            elevageController.setVolailles(volaillesx);
            if (type.equals("Canard")&& enDessous==true){
                elevageController.affichageCanard();
            }else if (type.equals("Canard")&& enDessous==false){
                elevageController.affichageCanardAbattre();
            }else if (type.equals("Poulet")&& enDessous==true){
                elevageController.affichagePoulet();
            }else if (type.equals("Poulet")&& enDessous==false){
                elevageController.affichagePouletAbattre();
            } else{
                elevageController.affichageBasique();
            }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    private void prixModif() {
        String type = choixPrix.getValue();
        double prixKg = Double.parseDouble(prixKgField.getText());
        if (type.equals("Poulet")) {
            this.elevage.setPrixPoulet(prixKg);
        } else {
            this.elevage.setPrixCanard(prixKg);
        }
    }

    @FXML
    private void validerPoidsAbattage() {
        String type = choixAbattage.getValue();
        double poidsAbattage = Double.parseDouble(poidsAbattageField.getText());
        if (type.equals("Poulet")) {
            this.elevage.setPoidsPoulet(poidsAbattage);
        } else {
            this.elevage.setPrixCanard(poidsAbattage);
        }
    }

}
