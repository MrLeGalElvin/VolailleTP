package fr.angers.poo.volaille;


public class Canard extends Volaille {
    private double poidsCanard = 10;

    public Canard(double p) {
        super(p);
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
    public String getType() {
        return "Canard";
    }

    @Override
    boolean assezGrosse(double poids) {
        return poids >= poidsCanard;
    }
}
