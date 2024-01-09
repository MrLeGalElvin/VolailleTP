package fr.angers.poo.volaille;

public class Poulet extends Volaille {
    private double poidsPoulet = 1;

    public Poulet(double p, int i) {
        super(p, i);
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
}
