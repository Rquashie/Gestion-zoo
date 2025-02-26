package modeleAnimaux;

public class Animal {
    private String nom;
    private String age ;
    private String sexe ;
    private double poids ;


    public Animal(String nom, String age, String sexe,double poids) {
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.poids = poids ;

    }
    public void seDeplacer(){
        System.out.println("L'animal est deplace");
    }
    public void faireDuBruit(){
        System.out.println("L'animal fait du bruit");
    }
    public void manger(){
        System.out.println("L'animal mange");
    }
    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }


    public String toString() {
        return "Nom : "+nom+"\nAge : "+age+"\nSexe : "+sexe+"\nPoids : "+String.format("%.2f",poids);
    }
}
