package fr.angers.poo;

public class CanardController extends VolailleController {
    private double poidsCanard = 1;

    CanardController(double p, int i) {
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
        return poids * ElevageController.getPrixCanard();
    }

    @Override
    boolean assezGrosse() {
        return poids >= poidsCanard;
    }
}
