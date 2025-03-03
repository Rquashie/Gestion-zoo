package modele;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Zoo {
    private String nom ;
    private ArrayList<Animal> lesAnimaux;
    private ArrayList<Soigneur> lesSoigneurs;
    private ArrayList<Visiteur>lesVisiteurs;

    public Zoo(String nom ) {
        this.nom = nom;
        this.lesAnimaux = new ArrayList<>();
        this.lesSoigneurs = new ArrayList<>();
        this.lesVisiteurs = new ArrayList<>();
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
    public void inscrireVisiteurZoo(Visiteur v){
        this.lesVisiteurs.add(v);
        System.out.println("Le visiteur a bien été inscrit au zoo");
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
    public void afficherLesVisiteurs(){
        if(this.lesVisiteurs.isEmpty()) {
            System.out.println("Aucun visiteur au zoo");
        }
        else {
            System.out.println("------Les visiteurs du zoo------ ");
            int i = 0 ;
            for (Visiteur v : this.lesVisiteurs) {
                i++ ;
                System.out.println("Id : "+i);
                System.out.println(v.toString());
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
    public Visiteur chercherVisiteur(String nom, String prenom){
        for(Visiteur v : this.lesVisiteurs){
            if(nom.equals(v.getNom()) && prenom.equals(v.getPrenom())){
                System.out.println("Visiteur trouvé");
                return v ;
            }
        }
        return null ;
    }
    public void exporterListeAnimaux() throws IOException {
        FileWriter fichier = new FileWriter("lesAnimaux.csv");
        fichier.append("Nom,Age,Poids,Espece\n");
        for(Animal a : this.lesAnimaux){
            fichier.append(a.getNom()+","+a.getAge()+","+a.getPoids()+","+a.getClass().getSimpleName()+"\n");
        }
        fichier.close();
    }
    public void exporterListeSoigneurs() throws IOException {
        FileWriter fichier = new FileWriter("lesSoigneurs.csv");
        fichier.append("Nom,Prenom,Specialite\n");
        for(Soigneur s : this.lesSoigneurs){
            fichier.append(s.getNom()+","+s.getPrenom()+","+s.getSpecialite()+"\n");
        }
        fichier.close();
    }
    public void exporterListeVisiteurs() throws IOException {
        FileWriter fichier = new FileWriter("lesSoigneurs.csv");
        fichier.append("Nom,Prenom,Age,Tarif\n");
        for(Visiteur v : this.lesVisiteurs){
            fichier.append(v.getNom()+","+v.getPrenom()+","+v.getAge()+","+v.getTarif()+" euros\n");
        }
        fichier.close();
    }

}
