package modele;

import java.util.Random;

public class Animal {
    private String nom;
    private String age;
    private double poids;
    private boolean estMalade ;


    public Animal(String nom, String age, double poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
        this.estMalade = false;

    }

    public void seDeplacer() {
        System.out.println("L'animal est deplace");
    }

    public void faireDuBruit() {
        System.out.println("L'animal fait du bruit");
    }

    public void manger() {
        System.out.println("L'animal mange");
    }

    public String getNom() {
        return this.nom;
    }
    public String getAge(){
        return this.age ;
    }

    public double getPoids() {
        return this.poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String toString() {
        return "Nom : " + this.nom + "\nAge : " + this.age+" ans" +  "\nPoids : " + this.poids+" kg";
    }
    public void malade() {
        this.estMalade = true ;
        this.setPoids(this.poids-0.20);
    }

    public boolean estMalade() {
        return this.estMalade ;
    }
    public void gueri(){
        this.estMalade = false ;
    }
    public boolean realiserUnTour() {
        int random = new Random().nextInt(101);
        if (random <= 90) {//90% de réussite du tour
            return true ;
        }
        else{
            return false ;
        }
    }



}

