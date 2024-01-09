package fr.angers.poo.volaille;


public class Canard extends Volaille {
    private double poidsCanard = 1;

    public Canard(double p, int i) {
        super(p, i);
    }

    public double getPoidsCanard() {
        return poidsCanard;
    }

    public void setPoidsCanard(double poidsCanard) {
        this.poidsCanard = poidsCanard;
    }

    @Override
    double prix() {
        return poids * Elevage.getPrixCanard();
    }

    @Override
    boolean assezGrosse() {
        return poids >= poidsCanard;
    }
}
