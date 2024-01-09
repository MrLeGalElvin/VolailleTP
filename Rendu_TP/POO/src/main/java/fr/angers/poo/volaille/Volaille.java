package fr.angers.poo.volaille;

public class Volaille {
    double poids;
    int identite;
    Volaille(double p, int i){
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
