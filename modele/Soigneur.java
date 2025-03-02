package modele;

import java.util.ArrayList;
import java.util.Random;

public class Soigneur extends Personne {
    private String specialite;
    private ArrayList<Animal> lesAnimauxduSoigneur;

    public Soigneur(String nom, String prenom, String specialite) {
        super(nom, prenom);
        this.specialite = specialite;
        this.lesAnimauxduSoigneur = new ArrayList<Animal>();
    }
    public String getSpecialite() {
        return specialite;
    }
    public void ajouterAnimal(Animal a) {
        this.lesAnimauxduSoigneur.add(a);
    }
    public void nourrirAnimal(Animal a){
        System.out.println("Nourriture : 7kg de viande");
        System.out.println("Poids initial : "+a.getPoids()) ;
        a.setPoids(a.getPoids()+0.850);
        System.out.println("Poids après avoir mangé : "+String.format("%.2f", a.getPoids()) );
    }

    public void afficherLesAnimauxDuSoigneur() {
        System.out.println("Animaux gérés par le soigneur " + this.getPrenom() + ' ' + this.getNom());
        for (Animal a : this.lesAnimauxduSoigneur) {
            System.out.println(a.toString());
        }
    }

    public void diagnostic(Animal a) {

        if (lesAnimauxduSoigneur.contains(a)) {
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


