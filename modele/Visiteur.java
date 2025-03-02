package modele;

public class Visiteur extends Personne{
    private String age ;
    private double tarif ;

    public Visiteur(String nom , String prenom ,String age ){
        super(nom,prenom);
        this.age = age;

    }
    public String getAge() {
        return age;
    }
    public void acheterBillet(){
        if(Integer.parseInt(this.age) < 16){
          this.tarif = 5.5 ;

    }
        else if (Integer.parseInt(this.age) > 16 && Integer.parseInt(this.age) < 65){
            this.tarif = 19.99 ;
        }
        else{
            this.tarif = 10.99 ;
        }
    }
    public double getTarif() {
        return tarif;
    }

    @Override
    public String toString() {
        return super.toString() + "\nage :" + this.age + "\ntarif : " + this.tarif ;
    }
}
