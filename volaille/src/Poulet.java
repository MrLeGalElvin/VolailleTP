// Classe initialisant le Poulet héritant de la classe volaille
public class Poulet extends Volaille{
    // variable contenant le poids du Poulet
    static double poidsPoulet = 1;
    static double prixPoulet = 1;

    // Constructeur referant à sa classe mère : Volaille
    Poulet(double p, int i){
        super(p,i);
    }

    /**
     * getter poids du Poulet
     * @return poids du Poulet
     */
    public static double getPoidsPoulet() {
        return poidsPoulet;
    }

    /**
     * setter poids du poulet
     * @param poidsPoulet
     */
    public static void setPoidsPoulet(double poidsPoulet) {
        Poulet.poidsPoulet = poidsPoulet;
    }

    /**
     *  getter prix du poulet au kilo
     * @return prix du poulet au kilo
     */
    public static double getPrixPoulet() {
        return prixPoulet;
    }

    /**
     * setter prix du poulet au kilo
     * @param prixPoulet
     */
    public static void setPrixPoulet(double prixPoulet) {
        Poulet.prixPoulet = prixPoulet;
    }

    /**
     * Récupère le prix du poulet (poids X pris par kilo)
     * @return prix total
     */
    double prix(){
        return poids * Constante.prixPoulet;
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

