package modeleAnimaux;

public class Oiseau extends Animal{
    public Oiseau(String nom , String age , String sexe) {
        super(nom, age, sexe);
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau vole");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("CUI-CUI");
    }
}
