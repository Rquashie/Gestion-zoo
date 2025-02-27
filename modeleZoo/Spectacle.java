package modeleZoo;

import modeleAnimaux.Animal;
import modelePersonne.Personne;
import modelePersonne.Soigneur;
import modelePersonne.Visiteur;

import java.util.ArrayList;

public class Spectacle {
    private String titre ;
    private String duree ;
    ArrayList <Animal> lesAnimaux ;
    ArrayList <Soigneur> lesSoigneur ;
    ArrayList <Visiteur> lesVisiteurs ;

    public Spectacle(String titre , String duree ) {
        this.titre = titre;
        this.duree = duree;
        this.lesAnimaux = new ArrayList<>() ;
        this.lesSoigneur = new ArrayList<>() ;
        this.lesVisiteurs = new ArrayList<>() ;
    }
    public void unVisiteurRentre(Visiteur visiteur) {
        this.lesVisiteurs.add(visiteur);
    }
    public void afficheLesVisiteurs() {
        System.out.println("Visiteurs présent au spéctacle "+this.titre);
        for(Visiteur visiteur : lesVisiteurs) {
            System.out.println(visiteur.toString());
            System.out.println("-----------------");
        }
    }
}
