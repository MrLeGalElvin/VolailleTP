class Canard extends Volaille{
    public double poidsCanard = 1;
    public double prixCanard = 5;
    Canard(double p, int i){
        super(p,i);
    }

    /**
     * poids du canard
     * @return
     */
    public double getPoidsCanard() {
        return poidsCanard;
    }

    /**
     * poids du canard
     * @param poidsCanard
     */
    public void setPoidsCanard(double poidsCanard) {
        this.poidsCanard = poidsCanard;
    }

    /**
     * getter prix du canard par kilo
     * @return
     */
    public double getPrixCanard() {
        return prixCanard;
    }

    /**
     * setter prix du canard par kilo
     * @param prixCanard
     */
    public void setPrixCanard(double prixCanard) {
        this.prixCanard = prixCanard;
    }

    /**
     * Renvoie le prix du canard en multipliant sont poid par son prix au kilos
     * @return
     */
    double prix(){
        return poids * this.prixCanard;
    }
    /**
     * Renvoie True si le canard est assez gros, false sinon
     */
    boolean assezGrosse(){
        if (poids >= this.poidsCanard) {
            return true;
        }
        return false;
    }
}