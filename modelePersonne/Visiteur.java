package modelePersonne;

public class Visiteur extends Personne{
    private String age ;
    private double tarif ;

    public Visiteur(String nom , String prenom ,String age ){
        super(nom,prenom);
        this.age = age;
        this.tarif = tarif;
    }
    public void calculPrix(Visiteur v){
        if(Integer.parseInt(v.age) < 16){
          this.tarif = 5 ;

    }
        else if (Integer.parseInt(v.age) > 16 && Integer.parseInt(v.age) < 65){
            this.tarif = 20 ;
        }
        else{
            this.tarif = 10 ;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nage :" + this.age + "\ntarif : " + this.tarif ;
    }
}
