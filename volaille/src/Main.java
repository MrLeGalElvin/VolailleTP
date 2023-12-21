public class Main{
    public static void main(String[] args){
        Elevage elevage1 = new Elevage();
        for (int i=0; i<15; i++){
            elevage1.ajouter(new Poulet(0.250,150+i));
        }
        for (int i=0; i<15; i++){
            elevage1.ajouter(new Canard(0.250,380+i));
        }
        for (int i=0; i<10; i++){
            elevage1.ajouter(new Poulet(0.250,700+i));
        }
        elevage1.ajouter(new Canard(0.750,825));
        for (int i=0; i<8; i++){
            elevage1.changePoids(155+i,1.3);
            elevage1.changePoids(382+i,1.55);
        }
        //Verifie la liste des animaux
        elevage1.ecrire();
        Terminal.ecrireString("Prix des animaux a abattre: ");
        Terminal.ecrireDoubleln(elevage1.evaluerBetesAAbattre());
        elevage1.envoyerALAbattoir();
        //Verifie la liste des animaux après l'abattage
        elevage1.ecrire();
        //verifie qu'il n'y a bien plus d'animaux à abattre
        Terminal.ecrireString("Prix des animaux a abattre: ");
        Terminal.ecrireDoubleln(elevage1.evaluerBetesAAbattre());
    }
}