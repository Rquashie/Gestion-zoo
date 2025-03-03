package modele;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Zoo {
    private String nom ;
    private ArrayList<Animal> lesAnimaux;
    private ArrayList<Soigneur> lesSoigneurs;

    public Zoo(String nom ) {
        this.nom = nom;
        this.lesAnimaux = new ArrayList<>();
        this.lesSoigneurs = new ArrayList<>();
    }
    public void ouvrirZoo(){
        System.out.println("Bienvenue au "+this.nom);
    }
    public String getNom() {
        return this.nom;
    }


    public void inscrireAnimalZoo(Animal a ){
            this.lesAnimaux.add(a);
            System.out.println("L'animal a bien été inscrit au zoo");
        }
    public void inscrireSoigneurZoo(Soigneur s ){
        this.lesSoigneurs.add(s);
        System.out.println("Le soigneur a bien été inscrit au zoo");
    }

    public void afficherLesAnimauxDuZoo(){
        if(this.lesAnimaux.isEmpty()) {
            System.out.println("Aucun animal inscrit au zoo");
        }
        else {
            System.out.println("------Les animaux du zoo -----------");
            int i = 0 ;
            for (Animal a : this.lesAnimaux) {
                i++ ;
                System.out.println("Id : "+i);
                System.out.println(a.toString());
                System.out.println("-------");
            }
        }
    }
    public void afficherLesSoigneurs(){
        if(this.lesSoigneurs.isEmpty()) {
            System.out.println("Aucun soigneur au zoo");
        }
        else {
            System.out.println("------Les soigneurs du zoo------ ");
            int i = 0 ;
            for (Soigneur s : this.lesSoigneurs) {
                i++ ;
                System.out.println("Id : "+i);
                System.out.println(s.toString());
                System.out.println("------------");
            }
        }
    }
    public Soigneur chercherSoigneur(String nom){
        for(Soigneur s : this.lesSoigneurs){
            if(nom.equals(s.getNom())){
                System.out.println("Soigneur trouvé");
                return s;
            }
        }
        return null ;
    }
    public Animal chercherAnimal(String nom){
        for(Animal a : this.lesAnimaux){
            if(nom.equals(a.getNom())){
                System.out.println("Animal trouvé");
                return a ;
            }
        }
        return null ;
    }

}
