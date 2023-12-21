class Canard extends Volaille{
    static double poidsCanard = 1;
    Canard(double p, int i){
        super(p,i);
    }
    /**
     * Change le poids du canard pour l'abattage
     * @param x : le poids du canard
     */
    static void changePoidsAbattage(double x){
        poidsCanard = x;
    }
    /**
     * Renvoie le prix du canard en multipliant sont poid par son prix au kilos
     * @return
     */
    double prix(){
        return poids * Constante.prixCanard;
    }
    /**
     * Renvoie True si le canard est assez gros, false sinon
     */
    boolean assezGrosse(){
        if (poids >= poidsCanard) {
            return true;
        }
        return false;
    }
}