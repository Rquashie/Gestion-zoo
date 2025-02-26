package modeleAnimaux;

public class Oiseau extends Animal{
    public Oiseau(String nom , String age , String sexe,double poids) {
        super(nom, age, sexe,poids);
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau vole");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Oiseau : CUI-CUI-CUI-CUI");
    }
}
