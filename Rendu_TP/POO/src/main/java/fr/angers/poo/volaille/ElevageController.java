package fr.angers.poo.volaille;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.List;
/**
 * Contrôleur pour l'affichage des détails des volailles.
 */
public class ElevageController {
    @FXML
    private ListView<String> volaillesListView;
    private List<Volaille> volailles;
    /**
     * Définit la liste des volailles à afficher.
     *
     * @param volaillesList La liste des volailles à afficher.
     */
    public void setVolailles(List<Volaille> volaillesList) {
        this.volailles = volaillesList;

    }

    /**
     * Affiche les détails basiques de toutes les volailles.
     */
    @FXML
    public void affichageBasique() {
        if (volailles != null) {
            for (Volaille volaille : volailles) {
                volaillesListView.getItems().add("Id: " + volaille.getId() +
                        ", Poids: " + volaille.getPoids() +
                        ", Type: " + volaille.getType());
            }
        }
    }
    /**
     * Affiche les détails des canards en dessous d'un certain poids.
     */
    public void affichageCanard() {
        if (volailles != null) {
            for (Volaille volaille : volailles) {
                if(Elevage.getPoidsCanard()>volaille.getPoids() && volaille.getType().equals("Canard")) {
                    volaillesListView.getItems().add("Id: " + volaille.getId() +
                            ", Poids: " + volaille.getPoids());

                }
            }
        }
    }
    /**
     * Affiche les détails des canards à abattre et calcule le coût total.
     */
    public void affichageCanardAbattre() {
        double somme=0;
        if (volailles != null) {
            for (Volaille volaille : volailles) {
                if(Elevage.getPoidsCanard()<volaille.getPoids() && volaille.getType().equals("Canard")) {
                    volaillesListView.getItems().add("Id: " + volaille.getId() +
                            ", Prix: " + volaille.prix());
                    somme+=volaille.prix();
                }
            }volaillesListView.getItems().add("Total" + somme);
        }
    }
    /**
     * Affiche les détails des poulets en dessous d'un certain poids.
     */
    public void affichagePoulet() {
        if (volailles != null) {
            for (Volaille volaille : volailles) {
                if(volaille.getType().equals("Poulet") && Elevage.getPoidsPoulet()>volaille.getPoids()) {
                    volaillesListView.getItems().add("Id: " + volaille.getId() +
                            ", Poids: " + volaille.getPoids());
                }
            }
        }
    }
    /**
     * Affiche les détails des poulets à abattre et calcule le coût total.
     */
    public void affichagePouletAbattre() {
        double somme=0;
        if (volailles != null) {
            for (Volaille volaille : volailles) {
                if(Elevage.getPoidsPoulet()<volaille.getPoids() && volaille.getType().equals("Poulet")) {
                    volaillesListView.getItems().add("Id: " + volaille.getId() +
                        ", Prix: " + volaille.prix());
                    somme+=volaille.prix();
                }
            }volaillesListView.getItems().add("Total" + somme);
        }
    }
}