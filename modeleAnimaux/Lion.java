package modeleAnimaux;

public class Lion extends Animal {
    public Lion (String nom , String age , String sexe){
        super(nom, age, sexe);
    }

    @Override
    public void seDeplacer() {
        System.out.println("Le lion marche");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("GRRRRRRRRRRRRR");
    }
}
