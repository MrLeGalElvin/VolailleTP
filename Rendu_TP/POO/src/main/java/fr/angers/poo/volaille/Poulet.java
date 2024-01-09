package fr.angers.poo.volaille;

public class Poulet extends Volaille {
    private double poidsPoulet = 10;

    public Poulet(double p) {
        super(p);

    }

    public double getPoidsPoulet() {
        return this.poidsPoulet;
    }

    public void setPoidsPoulet(double poidsPoulet) {
        this.poidsPoulet = poidsPoulet;
    }

    @Override
    double prix() {
        return poids * Elevage.getPrixPoulet();
    }

    @Override
    boolean assezGrosse(double poids) {
        return poids >= poidsPoulet;
    }

    public String getType() {
        return "Poulet";
    }
}
