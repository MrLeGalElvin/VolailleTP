package fr.angers.poo.volaille;

import java.util.ArrayList;
import java.util.List;

public class Elevage {
    private static double prixPoulet=12;
    private static double prixCanard=12;
    private static double poidsPoulet=10;
    private static double poidsCanard=10;
    public ArrayList<Volaille> tab;
    public Elevage() {
        // Initialisez votre liste dans le constructeur
        this.tab = new ArrayList<>();
    }
    public ArrayList<Volaille> liste_abattre;
    public static double getPoidsPoulet() {
        return poidsPoulet;
    }

    public static void setPoidsPoulet(double poidsPoulet) {
        Elevage.poidsPoulet = poidsPoulet;
    }

    public static double getPoidsCanard() {
        return poidsCanard;
    }

    public static void setPoidsCanard(double poidsCanard) {
        Elevage.poidsCanard = poidsCanard;
    }

    //Compteur nombre de bête
    int nbBetes = 0;
    /**
     * Ajout une volaille dans le tableau et incrémente le compteur de 1
     * @param v : la volaille à ajouter
     */
    /*public void ajouter(Volaille v){
        tab.set(nbBetes, v);
        nbBetes++;
    }*/
    /**
     * Recherche dans la tableau la volaille à l'id indiqué
     * @param id : le numero de la volaille (corresponds a l'ordre dans lequels les volailles ont été ajoutés)
     */
    Volaille rechercher(int id){
        for
        (int i=0; i<nbBetes; i++){
            if (tab.get(i).identite == id){
                return tab.get(i);
            }
        }
        return null
                ;
    }
    /**
     * Permet de changer le poids d'une volaille
     * @param id : identifiant de la volaille impacté par le changement
     * @param np : Poids qui va écraser l'ancien enregistrer
     */
    void changePoids(int id, double np){
        rechercher(id).changePoids(np);
    }

    /**
     * @return Renvoie la somme estimé des revenues des bêtes prête à être abbatue
     */
    double evaluerBetesAAbattre(){
        double res = 0;
        for
        (int i=0; i<nbBetes; i++){
            double poids;
            if (tab.get(i) instanceof Canard){
                poids = this.poidsCanard;
            } else {
                poids = this.poidsPoulet;
            }
            if (tab.get(i).assezGrosse(poids)){
                res = res+ tab.get(i).prix();
            }
        }
        return res;
    }

    /**
     * @return Retourne un tableau des volailles à envoyer à l'abattoir
     */
    Volaille[] envoyerALAbattoir(){
        Volaille[] res = new Volaille[100];
        int nb = 0;
        int i = 0;
        while (i < nbBetes){
            double poids;
            if (tab.get(i) instanceof Canard){
                poids = this.poidsCanard;
            } else {
                poids = this.poidsPoulet;
            }
            if (tab.get(i).assezGrosse(poids)){
                res[nb] = tab.get(i);
                nb++;
                tab.set(i, tab.get(nbBetes - 1));
                nbBetes--;
            }else
            {
                i++;
            }
        }
        return res;
    }

    /**
     * Affiche l'identité , le poids et le prix de chaque volaille
     */
    public void ecrire(){
        for (int i=0; i<nbBetes; i++){
            Terminal.ecrireStringln(" " + tab.get(i).identite + " " +
                    tab.get(i).poids + " " +
                    tab.get(i).prix());
        }
    }
    /**
     *  getter prix du poulet au kilo
     * @return prix du poulet au kilo
     */
    public static double getPrixPoulet() {
        return prixPoulet;
    }

    /**
     * setter prix du poulet au kilo
     * @param prixP
     */
    public void setPrixPoulet(double prixP) {
        prixPoulet = prixP;
    }
    public static double getPrixCanard() {
        return prixCanard;
    }

    public void setPrixCanard(double prixC) {
        prixCanard = prixC;
    }
    public void addVolaille(Volaille volaille) {
        tab.add(volaille);
    }
    public List<Volaille> getVolaille() {
        return tab;
    }
}
