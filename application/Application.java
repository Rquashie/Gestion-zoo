package application;

import modele.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choix = 0 ;
        boolean ouvert = true;
        Scanner sc = new Scanner(System.in);
        String poidsLionStr = "",poidsOiseauStr = "",poidsSerpentStr = "" ;
        double poidsLion = 0.0,poidsOiseau = 0.0,poidsSerpent = 0.0;

        System.out.println("\nGESTION DU ZOO");
        System.out.println("1 - Ouvrir le zoo");
        System.out.println("2 - Ajouter un animal");
        System.out.println("3 - Afficher les animaux du zoo");
        System.out.println("4 - Ajouter un soigneur");
        System.out.println("5 - Affecter un soigneur à un animal");
        System.out.println("6 - Afficher les animaux du soigneur");
        System.out.println("7 - Donner à manger à un animal");
        System.out.println("8 - Diagnostiquer un animal");
        System.out.println("9 - Soigner un animal");
        System.out.println("10 - Ajouter un visiteur");
        System.out.println("11 - Un visiteur achète un billet");
        System.out.println("12 - Afficher les statistiques du zoo");
        System.out.println("13 - Exporter les statistiques en JSON");
        System.out.println("14 - Exporter les statistiques sur Excel");
        System.out.println("15 - Fermer");
        Zoo zoo = new Zoo("Zoo de Madagascar");

        do {

            System.out.println("Choisir une action : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1 :
                    zoo.ouvrirZoo();
                    break ;
                case 2 :
                    System.out.println("Nom de l'espèce : ");
                    String nom = sc.next();
                    if(nom.equals("Lion")){
                        System.out.println("Nom du lion : ");
                        String nomLion = sc.next();
                        System.out.println("Age du lion : ");
                        String ageLion = sc.next();
                        System.out.println("Sexe du lion : ");
                        String sexeLion = sc.next();
                        System.out.println("Poids du lion : ");
                        while(!sc.hasNext()){
                            System.out.println("Poids du lion : ");
                            poidsLionStr = sc.nextLine().replace(",",".");
                        }
                        poidsLion = Double.parseDouble(poidsLionStr) ;
                        Lion lion = new Lion(nomLion , ageLion , sexeLion , poidsLion);
                        zoo.inscrireAnimalZoo(lion);
                        sc.nextLine();
                        break ;
                    }
                    else if(nom.equals("Oiseau")){
                        System.out.println("Nom de l'oiseau : ");
                        String nomOiseau = sc.next();
                        System.out.println("Age de l'oiseau : ");
                        String ageOiseau = sc.next();
                        System.out.println("Sexe de l'oiseau : ");
                        String sexeOiseau = sc.next();
                        System.out.println("Poids de l'oiseau : ");
                        while(!sc.hasNext()){
                            System.out.println("Poids de l'oiseau : ");
                            poidsOiseauStr = sc.next();

                        }
                        poidsOiseau = Double.parseDouble(poidsOiseauStr) ;
                        sc.nextLine();
                        Oiseau oiseau = new Oiseau(nomOiseau,ageOiseau,sexeOiseau,poidsOiseau);
                        zoo.inscrireAnimalZoo(oiseau);
                        break ;
                    }
                    else if (nom.equals("Serpent")){
                        System.out.println("Nom du serpent: ");
                        String nomSerpent = sc.next();
                        System.out.println("Age du serpent : ");
                        String ageSerpent = sc.next();
                        System.out.println("Sexe du serpent: ");
                        String sexeSerpent = sc.next();
                        System.out.println("Poids du serpent : ");
                        while(!sc.hasNext()) {
                            System.out.println("Poids du serpent : ");
                            poidsSerpentStr = sc.next();

                        }
                        poidsSerpent = Double.parseDouble(poidsSerpentStr) ;
                        sc.nextLine();
                        Serpent serpent = new Serpent(nomSerpent,ageSerpent,sexeSerpent,poidsSerpent);
                        zoo.inscrireAnimalZoo(serpent);
                        break ;
                    }
                case 3 :
                    zoo.afficherLesAnimauxDuZoo();
                    break ;


                case 5 :
                    ouvert = false;
                    System.out.println("Fermeture du zoo");
                    break;
                case 6 :
                    Billeterie billeterie = new Billeterie();
                    billeterie.getRecettesTotales() ;
            }

        }while (ouvert);
    }
}
