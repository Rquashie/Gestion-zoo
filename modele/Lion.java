package modele;

import java.util.Random;

public class Lion extends Animal {
    public Lion (String nom , String age , String sexe,double poids){
        super(nom, age, sexe,poids);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le lion marche");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Lion : GRRRRRRRRRRRRR");
    }

    @Override
    public void manger() {
        super.manger();
        System.out.println("Nourriture : 7kg de viande");
        System.out.println("Poids initial : "+super.getPoids()) ;
        super.setPoids(super.getPoids()+0.850);
        System.out.println("Poids après avoir mangé : "+String.format("%.2f", super.getPoids()) );
    }
    @Override
    public boolean realiserUnTour() {
        boolean reussi = super.realiserUnTour();
        if (reussi){
            System.out.println("Annonceur : Le lion bondit et traverse le cerceau enflammé !");
            faireDuBruit();
    }
        else {
            System.out.println("Annonceur : Oh non le lion hésite et recule !");
        }
        return reussi ;
    }

}
