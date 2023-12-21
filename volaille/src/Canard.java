public class Canard extends Volaille{
    public double poidsCanard = 1;

    Canard(double p, int i){
        super(p,i);
    }

    void changePoidsCanard(double x){
        this.poidsCanard = x;
    }

    double prix(){
        return poids * Constante.prixCanard;
    }
    boolean assezGrosse(){
        if (poids >= poidsCanard) {
            return true;
        }
        return false;
    }
}