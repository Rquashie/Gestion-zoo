package modele;

public class Oiseau extends Animal{
    public Oiseau(String nom , String age ,double poids) {
        super(nom, age, poids);
    }

    @Override
    public void seDeplacer() {
        System.out.println("L'oiseau vole");
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Oiseau : CUI-CUI-CUI-CUI");
    }

    @Override
    public String toString() {
        return super.toString()+"\nEspece : "+getClass().getSimpleName() ;
    }
}
