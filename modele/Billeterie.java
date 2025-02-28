package modele;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class Billeterie {
    private double recettesTotales;
    private int nombreDeBilletVendus ;
    private ArrayList<Visiteur> listeClients;
    private ArrayList<Visiteur>listeClientsEnfants ;
    private ArrayList<Visiteur> listeClientsAdultes ;
    private ArrayList<Visiteur>listeClientsSenior ;

    public Billeterie() {
        this.recettesTotales = 0;
        this.nombreDeBilletVendus = 0;
        this.listeClients = new ArrayList<>();
        this.listeClientsEnfants = new ArrayList<>();
        this.listeClientsAdultes = new ArrayList<>();
        this.listeClientsSenior = new ArrayList<>();
    }

    public void passeAlaCaisse(Visiteur v){
        listeClients.add(v) ;
        nombreDeBilletVendus++;
        if(Integer.parseInt(v.getAge()) <16){
            listeClientsEnfants.add(v);
            double tarif = v.getTarif();
            this.recettesTotales += tarif;
        }
        else if (Integer.parseInt(v.getAge()) > 16 && Integer.parseInt(v.getAge()) < 65){
            listeClientsAdultes.add(v);
            double tarif = v.getTarif();
            this.recettesTotales += tarif;
        }
        else {
            listeClientsSenior.add(v);
            double tarif = v.getTarif();
            this.recettesTotales += tarif;
        }
        Instant instant = Instant.now();
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Paris"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy HH:mm:ss", Locale.FRANCE);
        String dateTexte = dateTime.format(formatter);

        System.out.println("JUSTIFICATIF D'ACHAT :");
        System.out.println("Nom de l'acheteur : "+v.getPrenom()+" "+v.getNom()+"\n" +
                "Prix du billet : "+v.getTarif()+" euros\n" +
                "Date et heure de l'achat : "+dateTexte+"\n");
    }
    public String getRecettesTotales() {
        DecimalFormat df1 = new DecimalFormat( "#.##" );
        return "Recettes totales : "+df1.format(this.recettesTotales)+" euros";
    }
    public String getNombreDeBilletVendus() {
        return "Nombre de billets vendus : "+this.nombreDeBilletVendus ;
    }
    public String repartitionBilletsCategories(){
        int nbEnfants = 0 ;
        int nbAdultes = 0 ;
        int nbSenior = 0 ;

        for(Visiteur a : listeClientsAdultes){
            nbAdultes ++ ;
        }
        for(Visiteur e : listeClientsEnfants){
            nbEnfants ++ ;
        }
        for(Visiteur s : listeClientsSenior){
            nbSenior++ ;
        }
        return "Enfants : "+nbEnfants+" visiteurs"+"\nAdultes : "+nbAdultes+" visiteurs"+"\nSenior : "+nbSenior+" visiteurs\n" ;
    }


}
