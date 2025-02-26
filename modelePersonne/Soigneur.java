package modelePersonne;

import modeleAnimaux.Animal;

import java.util.ArrayList;

public class Soigneur extends Personne{
    private String specialite ;
    private ArrayList<Animal>listeAnimaux;

    public Soigneur(String nom , String prenom , String specialite) {
        super(nom , prenom);
        this.specialite = specialite;
        this.listeAnimaux = new ArrayList<Animal>();
    }
    public void ajouterAnimal(Animal a){
        if(specialite.equals(a.getClass().getSimpleName())) {
            this.listeAnimaux.add(a);
        }
        else {
            System.out.println("Le soigneur n'est pas spécialiste de cet animal");
        }
    }
    public void afficherAnimaux(){
        System.out.println("Animaux gérés par le soigneur "+this.getPrenom()+' '+this.getNom());
        for(Animal a : this.listeAnimaux){
            System.out.println(a.toString());
        }
    }

    public String getSpecialite() {
        return specialite;
    }
}
