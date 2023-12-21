class Poulet extends Volaille{
    static double poidsPoulet = 1;
    Poulet(double p, int i){
        super(p,i);
    }
    static void changePoidsPoulet(double x){
        poidsPoulet = x;
    }
    double prix(){
        return poids * Constante.prixPoulet;
    }
    boolean assezGrosse(){
        if (poids >= poidsPoulet) {
            return true;
        }
        return false;
    }
}

