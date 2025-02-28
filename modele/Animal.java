package modele;

import java.util.Random;

public class Animal {
    private String nom;
    private String age;
    private String sexe;
    private double poids;
    private boolean estMalade ;


    public Animal(String nom, String age, String sexe, double poids) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
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
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String toString() {
        return "Nom : " + nom + "\nAge : " + age + "\nSexe : " + sexe + "\nPoids : " + String.format("%.2f", poids);
    }
    public void malade() {
        this.estMalade = true ;
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

