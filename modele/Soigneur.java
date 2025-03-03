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



    @Override
    public String toString() {
        return super.toString() + "\nspecialite : " + this.specialite;
    }

    public void ajouterAnimal(Animal a) {
        this.lesAnimauxduSoigneur.add(a);
    }
    public void soigneurPrendEnCharge(Animal an ) {
        if(!this.specialite.equals(an.getClass().getSimpleName())){
            System.out.println("Le soigneur "+this.getPrenom()+" "+this.getNom()+" n'est pas spécialiste des "+an.getClass().getSimpleName());
        }
       if(lesAnimauxduSoigneur.contains(an)) {
           System.out.println(an.getNom()+" est déja pris en charge par "+this.getPrenom()+" "+this.getNom());
       }
       else {
           lesAnimauxduSoigneur.add(an);
           System.out.println("Affectation effectué avec succès");
       }
    }
    public void nourrirAnimal(Animal a) {
        if (!lesAnimauxduSoigneur.contains(a)) {
            System.out.println("Animal introuvable");
        } else {
            System.out.println("Nourriture : 7kg de viande");
            System.out.println("Poids initial : " + a.getPoids());
            a.setPoids(a.getPoids() + 0.850);
            System.out.println("Poids après avoir mangé : " + String.format("%.2f", a.getPoids()));
        }
    }

    public void afficherLesAnimauxDuSoigneur() {
        System.out.println("Animaux gérés par le soigneur " + this.getPrenom() + ' ' + this.getNom());
        for (Animal a : this.lesAnimauxduSoigneur) {
            System.out.println(a.toString());
            System.out.println("-------");
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
                System.out.println(a.getNom()+" a perdu du poids a cause de sa maladie");
                System.out.println("Il est passé de "+a.getPoids()+" poids à "+(a.getPoids()-0.20));
                a.setPoids(a.getPoids() - 0.20);
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


