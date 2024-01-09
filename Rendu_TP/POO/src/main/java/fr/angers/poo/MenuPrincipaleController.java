package fr.angers.poo;

import fr.angers.poo.volaille.Canard;
import fr.angers.poo.volaille.Elevage;
import fr.angers.poo.volaille.Poulet;
import fr.angers.poo.volaille.Volaille;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

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
        String type = choixAjout.getValue();
        double poids = Double.parseDouble(poidsField.getText());
        int quantite = Integer.parseInt(quantiteField.getText());

        // Your logic to add volaille here
        if (type == "Poulet") {
            for(int i = 0; i < quantite; ++i) {
                Poulet volaille = new Poulet(poids, 1);
                this.elevage.ajouter(volaille);
            }
        } else {
            for(int i = 0; i < quantite; ++i) {
                Canard volaille = new Canard(poids, 1);
                this.elevage.ajouter(volaille);
            }
        }
    }

    @FXML
    private void afficherVolaille() {
        String type = choixAff.getValue();
        boolean enDessous = enDessousCheckBox.isSelected();

    }

    @FXML
    private void prixModif() {
        String type = choixPrix.getValue();
        double prixKg = Double.parseDouble(prixKgField.getText());
        if (type == "Poulet") {
            this.elevage.setPrixPoulet(prixKg);
        } else {
            this.elevage.setPrixCanard(prixKg);
        }
    }

    @FXML
    private void validerPoidsAbattage() {
        String type = choixAbattage.getValue();
        double poidsAbattage = Double.parseDouble(poidsAbattageField.getText());
        if (type == "Poulet") {
            this.elevage.setPoidsPoulet(poidsAbattage);
        } else {
            this.elevage.setPrixCanard(poidsAbattage);
        }
    }

}
