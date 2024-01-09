package fr.angers.poo;

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

    public void initialize() {
        // Bind the visibility of sections to the selected choice in ChoixAction
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
        System.out.println("Type: " + type + ", Poids: " + poids + ", Quantité: " + quantite);
    }

    @FXML
    private void afficherVolaille() {
        String type = choixAff.getValue();
        boolean enDessous = enDessousCheckBox.isSelected();

        // Your logic to display volaille based on the selected type and checkbox
        System.out.println("Type: " + type + ", En dessous: " + enDessous);
    }

    @FXML
    private void prixModif() {
        String type = choixPrix.getValue();
        double prixKg = Double.parseDouble(prixKgField.getText());

        // Your logic to handle prix/kg modification based on the selected type and entered price
        System.out.println("Type: " + type + ", Prix par kg: " + prixKg);
    }

    @FXML
    private void validerPoidsAbattage() {
        String type = choixAbattage.getValue();
        double poidsAbattage = Double.parseDouble(poidsAbattageField.getText());

        // Your logic to handle validation based on the selected type and entered poids d'abattage
        System.out.println("Type: " + type + ", Poids d'abattage: " + poidsAbattage);
    }

}
