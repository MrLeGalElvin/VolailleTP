import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //creation elevage
        Elevage elevage1 = new Elevage();
        Scanner scanner = new Scanner(System.in);
        //Definir prix poids abattage
        System.out.println("Veuillez entrer le prix d'abattage des Canards:");
        double prixC=scanner.nextDouble();
        elevage1.setPrixCanard(prixC);
        System.out.println("Veuillez entrer le prix d'abattage des Poulets:");
        double prixP=scanner.nextDouble();
        elevage1.setPrixPoulet(prixP);
        scanner.close();
        //Ajout Volaille
        for (int i=0; i<12; i++){
            elevage1.ajouter(new Poulet(0.250,1+i));
        }
        for (int i=0; i<12; i++){
            elevage1.ajouter(new Canard(0.5,14+i));
        }
        for (int i=0; i<4; i++){
            elevage1.changePoids(7+i,1.3);
            elevage1.changePoids(16+i,1.55);
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