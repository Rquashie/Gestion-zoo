package application;

import modele.*;

public class Application {
    public static void main(String[] args) {

        //Ouvre le Zoo

        //Visiteur rentre

        //Spectacle commence
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
        Billeterie billeterie = new Billeterie() ;
        Visiteur visiteurA = new Visiteur("Dupont","Jean","26");
        billeterie.passeAlaCaisse(visiteurA);
        Visiteur visiteurB = new Visiteur("Rina","Toto","76") ;
        billeterie.passeAlaCaisse(visiteurB);
        Visiteur visiteurC = new Visiteur("Pacino","Al","5");
        billeterie.passeAlaCaisse(visiteurC);


        System.out.println("\n-------------Spectacle-------------------------");
        Spectacle spectacle1 = new Spectacle("Spectacle 1","01:30:00");
        spectacle1.unVisiteurAssisteAuSpectacle(visiteurA);
        spectacle1.unVisiteurAssisteAuSpectacle(visiteurB);
        spectacle1.afficheLesVisiteurs();
        spectacle1.annonceEntree(soigneur,lion);
        spectacle1.unSoigneurRentreAvecSonAnimal(soigneur,lion);
        spectacle1.soigneurPresenteAnimal(soigneur,lion);
        spectacle1.publicReagit(lion);

        System.out.println("\n-------------Finances----------------");
        System.out.println(billeterie.getRecettesTotales()) ;
        System.out.println(billeterie.repartitionBilletsCategories());
        System.out.println(billeterie.getNombreDeBilletVendus());



    }
}
