package application;

import modeleAnimaux.Lion;
import modeleAnimaux.Oiseau;
import modelePersonne.Soigneur;

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
        soigneur.afficherAnimaux();


    }
}
