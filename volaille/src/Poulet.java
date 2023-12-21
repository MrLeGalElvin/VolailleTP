// Classe initialisant le Poulet héritant de la classe volaille
public class Poulet extends Volaille{
    // variable contenant le poids du Poulet
    private double poidsPoulet = 1;
    private double prixPoulet = 12;

    // Constructeur referant à sa classe mère : Volaille
    Poulet(double p, int i){
        super(p,i);
    }

    /**
     * getter poids du Poulet
     * @return poids du Poulet
     */
    public static double getPoidsPoulet() {
        return this.poidsPoulet;
    }

    /**
     * setter poids du poulet
     * @param poidsPoulet
     */
    public void setPoidsPoulet(double poidsPoulet) {
        this.poidsPoulet = poidsPoulet;
    }

    /**
     *  getter prix du poulet au kilo
     * @return prix du poulet au kilo
     */
    public double getPrixPoulet() {
        return this.prixPoulet;
    }

    /**
     * setter prix du poulet au kilo
     * @param prixPoulet
     */
    public void setPrixPoulet(double prixPoulet) {
        this.prixPoulet = prixPoulet;
    }

    /**
     * Récupère le prix du poulet (poids X pris par kilo)
     * @return prix total
     */
    double prix(){
        return poids * this.prixPoulet;
    }

    /**
     * Vérifie si le poulet est assez gros
     * @return boolean : verifie si le test est une réussite ou non
     */
    boolean assezGrosse(){
        if (poids >= poidsPoulet) {
            return true;
        }
        return false;
    }
}

