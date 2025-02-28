package application;

import modele.Lion;
import modele.Oiseau;
import modele.Soigneur;
import modele.Visiteur;
import modele.Spectacle;

public class Application {
    public static void main(String[] args) {
        System.out.println("------------Oiseau------------------------");
        Oiseau oiseau = new Oiseau("Coco","5","M",2.5);
        oiseau.faireDuBruit();
        System.out.println("\n---------Lion-----------------------");
        Lion lion = new Lion("Roro","10","M",180.8);
        lion.faireDuBruit();
        lion.manger();
        System.out.println("\n----------Soigneur----------------------");
        Soigneur soigneur = new Soigneur("Quashie","Romario","Lion");
        soigneur.ajouterAnimal(lion);
        soigneur.diagnostic(lion);
        soigneur.soigner(lion);
        System.out.println("\n----------Visiteur---------------------");
        Visiteur visiteur1 = new Visiteur("Dupont","Jean","26");
        visiteur1.calculPrix(visiteur1);
        Visiteur visiteur2 = new Visiteur("Rina","Toto","76") ;
        visiteur2.calculPrix(visiteur2);

        System.out.println("-------------Spectacle-------------------------");
        Spectacle spectacle1 = new Spectacle("Spectacle 1","01:30:00");
        spectacle1.unVisiteurAssisteAuSpectacle(visiteur1);
        spectacle1.unVisiteurAssisteAuSpectacle(visiteur2);
        spectacle1.afficheLesVisiteurs();
        spectacle1.annonceEntree(soigneur,lion);
        spectacle1.unSoigneurRentreAvecSonAnimal(soigneur,lion);



    }
}
