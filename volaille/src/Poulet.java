// Classe initialisant le Poulet héritant de la classe volaille
public class Poulet extends Volaille{
    // variable contenant le poids du Poulet
    private double poidsPoulet = 1;


    // Constructeur referant à sa classe mère : Volaille
    Poulet(double p, int i){
        super(p,i);
    }

    /**
     * getter poids du Poulet
     * @return poids du Poulet
     */
    public double getPoidsPoulet() {
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
     * Récupère le prix du poulet (poids X pris par kilo)
     * @return prix total
     */
    double prix(){
        return poids * Elevage.getPrixPoulet();
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

