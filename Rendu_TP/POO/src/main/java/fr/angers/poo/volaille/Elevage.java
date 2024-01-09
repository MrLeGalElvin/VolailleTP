package fr.angers.poo.volaille;

public class Elevage {
    private static double prixPoulet;
    private static double prixCanard;
    Volaille[] tab = new Volaille[100];
    //Compteur nombre de bête
    int nbBetes = 0;
    /**
     * Ajout une volaille dans le tableau et incrémente le compteur de 1
     * @param v : la volaille à ajouter
     */
    public void ajouter(Volaille v){
        tab[nbBetes] = v;
        nbBetes++;
    }
    /**
     * Recherche dans la tableau la volaille à l'id indiqué
     * @param id : le numero de la volaille (corresponds a l'ordre dans lequels les volailles ont été ajoutés)
     */
    Volaille rechercher(int id){
        for
        (int i=0; i<nbBetes; i++){
            if (tab[i].identite == id){
                return tab[i];
            }
        }
        return null
                ;
    }
    /**
     * Permet de changer le poids d'une volaille
     * @param id : identifiant de la volaille impacté par le changement
     * @param np : Poids qui va écraser l'ancien enregistrer
     */
    void changePoids(int id, double np){
        rechercher(id).changePoids(np);
    }

    /**
     * @return Renvoie la somme estimé des revenues des bêtes prête à être abbatue
     */
    double evaluerBetesAAbattre(){
        double res = 0;
        for
        (int i=0; i<nbBetes; i++){
            if (tab[i].assezGrosse()){
                res = res+tab[i].prix();
            }
        }
        return res;
    }

    /**
     * @return Retourne un tableau des volailles à envoyer à l'abattoir
     */
    Volaille[] envoyerALAbattoir(){
        Volaille[] res = new Volaille[100];
        int nb = 0;
        int i = 0;
        while (i < nbBetes){
            if (tab[i].assezGrosse()){
                res[nb] = tab[i];
                nb++;
                tab[i]=tab[nbBetes-1];
                nbBetes--;
            }else
            {
                i++;
            }
        }
        return res;
    }

    /**
     * Affiche l'identité , le poids et le prix de chaque volaille
     */
    public void ecrire(){
        for (int i=0; i<nbBetes; i++){
            Terminal.ecrireStringln(" " + tab[i].identite + " " +
                    tab[i].poids + " " +
                    tab[i].prix());
        }
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
     * @param prixP
     */
    public void setPrixPoulet(double prixP) {
        prixPoulet = prixP;
    }
    public static double getPrixCanard() {
        return prixCanard;
    }

    public void setPrixCanard(double prixC) {
        prixCanard = prixC;
    }
}
