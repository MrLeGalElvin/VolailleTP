package fr.angers.poo;

public class PouletController extends VolailleController {
    private double poidsPoulet = 1;

    PouletController(double p, int i) {
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
        return poids * ElevageController.getPrixPoulet();
    }

    @Override
    boolean assezGrosse() {
        return poids >= poidsPoulet;
    }
}
