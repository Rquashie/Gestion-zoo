package modele;

import java.util.ArrayList;

public class Zoo {
    private String nom ;
    private ArrayList<Animal> lesAnimaux;
    private ArrayList<Soigneur> lesSoigneurs;

    public Zoo(String nom ) {
        this.nom = nom;
        this.lesAnimaux = new ArrayList<Animal>();
        this.lesSoigneurs = new ArrayList<Soigneur>();
    }
    public void ouvrirZoo(){
        System.out.println("Bienvenue au "+this.nom);
    }
    public void soigneurPrendEnCharge(Animal a , Soigneur s ) {
        if (s.equals(a.getClass().getSimpleName())) {
            s.ajouterAnimal(a);
        } else {
            System.out.println("Le soigneur n'est pas spécialiste de cet animal");
        }
    }
    public void inscrireAnimalZoo(Animal a ){
            this.lesAnimaux.add(a);
            System.out.println("L'animal a bien été inscrit au zoo");
        }

    public void afficherLesAnimauxDuZoo(){
        if(this.lesAnimaux.isEmpty()) {
            System.out.println("Aucun animal inscrit au zoo");
        }
        else {
            for (Animal a : this.lesAnimaux) {
                System.out.println(a.toString());
                System.out.println("-------");
            }
        }
    }
}
