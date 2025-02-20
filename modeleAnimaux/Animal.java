package modeleAnimaux;

public class Animal {
    private String nom;
    private String age ;
    private String sexe ;


    public Animal(String nom, String age, String sexe) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;

    }
    public void seDeplacer(){
        System.out.println("L'animal est deplace");
    }
    public void faireDuBruit(){
        System.out.println("L'animal fait du bruit");
    }
}
