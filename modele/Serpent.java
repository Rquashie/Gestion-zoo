package modele;

public class Serpent extends Animal {

    public Serpent(String nom , String age , String sexe , double poids){
        super(nom , age , sexe , poids);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le serpent rampe");
    }
    @Override
    public void faireDuBruit() {
        System.out.println("Serpent : KSSSSSS-KSSSSS-KSSSS");
    }

    @Override
    public void manger() {
        super.manger();
        System.out.println("Nourriture : Un rongeur de 500g");
        System.out.println("Poids initial : "+super.getPoids()) ;
        super.setPoids(super.getPoids()+0.60);
        System.out.println("Poids après avoir mangé : "+String.format("%.2f", super.getPoids()) );
    }
}
