package modelePersonne;

import modeleAnimaux.Animal;

import java.util.ArrayList;
import java.util.Random;

public class Soigneur extends Personne {
    private String specialite;
    private ArrayList<Animal> listeAnimaux;

    public Soigneur(String nom, String prenom, String specialite) {
        super(nom, prenom);
        this.specialite = specialite;
        this.listeAnimaux = new ArrayList<Animal>();
    }

    public void ajouterAnimal(Animal a) {
        if (specialite.equals(a.getClass().getSimpleName())) {
            this.listeAnimaux.add(a);
        } else {
            System.out.println("Le soigneur n'est pas spécialiste de cet animal");
        }
    }

    public void afficherAnimaux() {
        System.out.println("Animaux gérés par le soigneur " + this.getPrenom() + ' ' + this.getNom());
        for (Animal a : this.listeAnimaux) {
            System.out.println(a.toString());
        }
    }

    public void diagnostic(Animal a) {

        if (listeAnimaux.contains(a)) {
            int random = new Random().nextInt(2);
            if (random == 0) {
                System.out.println("Positif : L'animal est en pleine forme ");
            }
            else if (random == 1) {
                System.out.println("Negatif : "+this.getPrenom() + ' ' + this.getNom() + " remarque un problème de santé...");
                a.malade();
            }
        } else {
            System.out.println(this.getPrenom() + ' ' + this.getNom() + " ne peut pas diagnostiquer cet animal");
        }
    }
    public void soigner(Animal a) {
        if(a.estMalade()){
            System.out.println(this.getPrenom() + ' ' + this.getNom() +" soigne "+a.getNom());
            a.gueri();
            System.out.printf(a.getNom() +" est guéri");
        }
        else {
            System.out.println("Tout va bien rien à signaler !");
        }
    }

    }


