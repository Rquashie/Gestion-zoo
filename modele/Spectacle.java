package modele;

import java.util.ArrayList;

public class Spectacle {
    private String titre ;
    private String duree ;
    ArrayList <Soigneur> lesSoigneur ;
    ArrayList <Visiteur> lesVisiteurs ;

    public Spectacle(String titre , String duree ) {
        this.titre = titre;
        this.duree = duree;
        this.lesSoigneur = new ArrayList<>() ;
        this.lesVisiteurs = new ArrayList<>() ;
    }
    public void unVisiteurAssisteAuSpectacle(Visiteur visiteur) {
        this.lesVisiteurs.add(visiteur);
    }
    public void afficheLesVisiteurs() {
        System.out.println("Visiteurs présent au spéctacle "+this.titre);
        for(Visiteur visiteur : lesVisiteurs) {
            System.out.println(visiteur.toString());
            System.out.println("-----------------");
        }
    }

    public void annonceEntree(Soigneur s , Animal a){
        System.out.println("Annonceur : Mesdames et messieurs ,accueillez chaleureusement "+s.getPrenom()+' '+s.getNom()+" et" +
                " son animal "+a.getNom());
        lesSoigneur.add(s);
    }
    public void unSoigneurRentreAvecSonAnimal(Soigneur s,Animal a) {
        if (lesSoigneur.contains(s)) {
            System.out.println("Le soigneur marche avec son animal jusqu'au centre de la scène");
            a.faireDuBruit();
        }
    }
    public void soigneurPresenteAnimal(Soigneur s ,Animal a) {
        System.out.println(s.getPrenom()+' '+s.getNom()+" : Voici mon animal "+a.getNom());
    }
    public void publicReagit(Animal a){
        if(a.realiserUnTour()){
            System.out.println("Public : Wow !");
        }
        else{
            System.out.println("Public : Oh ...");
        }
    }


}
