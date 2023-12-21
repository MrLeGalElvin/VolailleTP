class Canard extends Volaille{
    static double poidsCanard = 1;
    Canard(double p, int i){
        super(p,i);
    }
    static void changePoidsCanard(double x){
        poidsCanard = x;
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