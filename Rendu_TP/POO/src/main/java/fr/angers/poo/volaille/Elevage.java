package fr.angers.poo.volaille;

public class Elevage {
    private static double prixPoulet;
    private static double prixCanard;

    // ... autres membres de la classe

    public static double getPrixPoulet() {
        return prixPoulet;
    }

    public void setPrixPoulet(double prixP) {
        prixPoulet = prixP;
    }

    public static double getPrixCanard() {
        return prixCanard;
    }

    public void setPrixCanard(double prixC) {
        prixCanard = prixC;
    }
}
