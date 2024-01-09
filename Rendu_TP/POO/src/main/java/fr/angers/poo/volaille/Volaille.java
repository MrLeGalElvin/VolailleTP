package fr.angers.poo.volaille;

import java.util.concurrent.atomic.AtomicInteger;

public class Volaille {
    double poids;
    int identite;
    private static final AtomicInteger ID_FACTORY = new AtomicInteger();
    private final int id;
    Volaille(double p){
        id = ID_FACTORY.getAndIncrement();
        poids = p;
    }
    void changePoids(double np){
        poids = np;
    }
    double prix(){
        return 0;
    }
    boolean assezGrosse(double poids){
        return false;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return "Volaille";
    }
}
