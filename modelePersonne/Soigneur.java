package modelePersonne;

public class Soigneur extends Personne{
    private String specialite ;

    public Soigneur(String nom , String prenom , String specialite) {
        super(nom , prenom);
        this.specialite = specialite;
    }
    public String getSpecialite() {
        return specialite;
    }
}
