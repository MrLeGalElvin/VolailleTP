// Classe initialisant le Poulet héritant de la classe volaille
class Poulet extends Volaille{
    // variable contenant le poids du Poulet
    static double poidsPoulet = 1;

    // Constructeur referant à sa classe mère : Volaille
    Poulet(double p, int i){
        super(p,i);
    }

    /**
     * Change la variable du poids du poulet
     * @param x : nouveau poids du poulet
     */
    static void changePoidsPoulet(double x){
        poidsPoulet = x;
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

