class Canard extends Volaille{
    static double prixAuKilo = 1.2;
    static double poidsAbattage = 1.5;
    Canard(double p, int i){
        super(p,i);
    }
    static void changePrix(double x){
        prixAuKilo = x;
    }
    static void changePoidsAbattage(double x){
        poidsAbattage = x;
    }
    double prix(){
        return poids *prixAuKilo;
    }
    boolean assezGrosse(){
        return poids >= poidsAbattage;
    }
}