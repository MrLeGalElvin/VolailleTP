public class Canard extends Volaille{
    public double poidsCanard = 1;
    // prix du canard au kilo
    public double prixCanard = 1;

    Canard(double p, int i){
        super(p,i);
    }

    /**
     * getter poids du canard
     * @return poids du canard
     */
    public double getPoidsCanard() {
        return poidsCanard;
    }

    /**
     * setter poids du canard
     * @param poidsCanard
     */
    public void setPoidsCanard(double poidsCanard) {
        this.poidsCanard = poidsCanard;
    }

    /**
     * getter prix du canard au kilo
     * @return prix du canard au kilo
     */
    public double getPrixCanard() {
        return prixCanard;
    }

    /**
     * setter prix du canard au kilo
     * @param prixCanard
     */
    public void setPrixCanard(double prixCanard) {
        this.prixCanard = prixCanard;
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