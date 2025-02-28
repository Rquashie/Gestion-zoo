package modele;

import java.util.ArrayList;

public class Zoo {
    private String nom ;
    private ArrayList<Zoo> spectacles;

    public Zoo(String nom ) {
        this.nom = nom;
        this.spectacles = new ArrayList<Zoo>();
    }

}
