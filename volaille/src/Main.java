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
        // Menu
        int choix;
        do {
            System.out.println("1. Afficher toutes les volailles");
            System.out.println("2. Afficher le prix total des volailles à abattre");
            System.out.println("3. Envoyer les bêtes à l'abattoir");
            System.out.println("4. Quitter le menu");
            System.out.println("Veuillez entrer votre choix :");
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    elevage1.ecrire();
                    break;
                case 2:
                    Terminal.ecrireDoubleln(elevage1.evaluerBetesAAbattre());
                    break;
                case 3:
                    elevage1.envoyerALAbattoir();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 4);

        scanner.close();
    }
}
