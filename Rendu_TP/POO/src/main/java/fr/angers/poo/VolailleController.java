package fr.angers.poo;

public class VolailleController {
    double poids;
    int identite;
    VolailleController(double p, int i){
        poids = p;
        identite = i;
    }
    void changePoids(double np){
        poids = np;
    }
    double prix(){
        return 0;
    }
    boolean assezGrosse(){
        return false;
    }
}
