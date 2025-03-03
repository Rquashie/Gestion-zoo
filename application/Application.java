package application;

import modele.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int choix = 0;
        boolean ouvert = true;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String nomEspece = "";
        double poidsLion = 0.0,poidsOiseau = 0.0,poidsSerpent = 0.0;
        String nomSoigneur = "" , prenomSoigneur = "" , specialite = "";
        String nomS = "",nomA ="";
        Soigneur leSoigneur_A_Affecter ;
        Animal Animal_A_Affecter;

        ArrayList<String> listeEspece = new ArrayList<>();
        listeEspece.add("Lion");
        listeEspece.add("Oiseau");
        listeEspece.add("Serpent");

        System.out.println("\nGESTION DU ZOO");
        System.out.println("1 - Ouvrir le zoo");
        System.out.println("2 - Ajouter un animal");
        System.out.println("3 - Afficher la liste des animaux du zoo");
        System.out.println("4 - Ajouter un soigneur");
        System.out.println("5 - Affiche la liste des soigneurs");
        System.out.println("6 - Affecter un soigneur à un animal");
        System.out.println("7 - Afficher les animaux du soigneur");
        System.out.println("8 - Donner à manger à un animal");
        System.out.println("9 - Diagnostiquer un animal");
        System.out.println("10 - Soigner un animal");
        System.out.println(" - Ajouter un visiteur");
        System.out.println(" - Un visiteur achète un billet");
        System.out.println(" - Afficher les statistiques du zoo");
        System.out.println(" - Exporter les statistiques en JSON");
        System.out.println(" - Exporter les statistiques sur Excel");
        System.out.println(" - Fermer");
        Zoo zoo = new Zoo("Zoo de Madagascar");

        do {

            System.out.println("Choisir une action : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1 :
                    zoo.ouvrirZoo();
                    break ;
                case 2 :
                    System.out.println("Nom de l'espèce : ");
                    nomEspece = sc.next();
                    if(nomEspece.equals("Lion")) {
                        System.out.println("Nom du lion : ");
                        String nomLion = sc.next();
                        System.out.println("Age du lion : ");
                        String ageLion = sc.next();
                        System.out.println("Poids du lion : ");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Entrez un poids valide ");
                            sc.next();
                        }
                        poidsLion = sc.nextDouble();
                        sc.nextLine();
                        Lion lion = new Lion(nomLion, ageLion,  poidsLion);
                        zoo.inscrireAnimalZoo(lion);
                        break ;
                    }


                    else if(nomEspece.equals("Oiseau")){
                        System.out.println("Nom de l'oiseau : ");
                        String nomOiseau = sc.next();
                        System.out.println("Age de l'oiseau : ");
                        String ageOiseau = sc.next();
                        System.out.println("Poids de l'oiseau : ");
                        while (!sc.hasNextDouble()) {
                            System.out.println("Entrez un poids valide ");
                            sc.next();
                        }
                        poidsOiseau = sc.nextDouble();
                        sc.nextLine();
                        Oiseau oiseau = new Oiseau(nomOiseau,ageOiseau,poidsOiseau);
                        zoo.inscrireAnimalZoo(oiseau);
                        break ;
                    }
                    else if (nomEspece.equals("Serpent")){
                        System.out.println("Nom du serpent: ");
                        String nomSerpent = sc.next();
                        System.out.println("Age du serpent : ");
                        String ageSerpent = sc.next();
                        System.out.println("Poids du serpent : ");
                        while(!sc.hasNextDouble()) {
                            System.out.println("Poids du serpent : ");
                            sc.next();
                        }
                        poidsSerpent = sc.nextDouble();
                        sc.nextLine();
                        Serpent serpent = new Serpent(nomSerpent,ageSerpent , poidsSerpent);
                        zoo.inscrireAnimalZoo(serpent);
                        break ;
                    }
                case 3 :
                    zoo.afficherLesAnimauxDuZoo();
                    break ;

                case 4 :
                    System.out.println("Nom du soigneur : ");
                    nomSoigneur = sc.nextLine();
                    System.out.println("Prenom du soigneur : ");
                    prenomSoigneur = sc.nextLine() ;
                    System.out.println("Spécialité du soigneur (1ère lettre en majuscule) : ");
                    while(true){
                        specialite = sc.nextLine() ;
                        if(listeEspece.contains(specialite)){
                            break ;
                        }
                        System.out.println("Veuilleza saisir une spsécialité présente dans le zoo ");
                    }
                    Soigneur soigneur = new Soigneur(nomSoigneur,prenomSoigneur,specialite);
                    zoo.inscrireSoigneurZoo(soigneur);
                    break ;

                case 5 :
                    zoo.afficherLesSoigneurs();
                    break ;
                case 6 :
                    System.out.println("Nom du soigneur : ");
                    nomS = sc.next();
                    leSoigneur_A_Affecter =  zoo.chercherSoigneur(nomS);

                    if(leSoigneur_A_Affecter==null){
                        System.out.println("Aucun soigneur trouver avec ce nom");
                        break ;
                    }

                    System.out.println("Nom de l'animal : ");
                    nomA = sc.next();
                    Animal_A_Affecter = zoo.chercherAnimal(nomA);
                    if(Animal_A_Affecter==null){
                        System.out.println("Aucun animal trouvé avec ce nom");
                        break ;
                    }
                    leSoigneur_A_Affecter.soigneurPrendEnCharge(Animal_A_Affecter);
                    break ;
                case 7 :
                    System.out.println("Nom du soigneur : ");
                    nomS = sc.next();
                    leSoigneur_A_Affecter =  zoo.chercherSoigneur(nomS);
                    System.out.println("Soigneur trouvé : "+leSoigneur_A_Affecter);
                    leSoigneur_A_Affecter.afficherLesAnimauxDuSoigneur();
                    break ;
                case 8 :
                    System.out.println("Nom du soigneur : ");
                    nomS = sc.next();
                    leSoigneur_A_Affecter =  zoo.chercherSoigneur(nomS);

                    if(leSoigneur_A_Affecter==null){
                        System.out.println("Aucun soigneur trouver avec ce nom");
                        break ;
                    }

                    System.out.println("Nom de l'animal : ");
                    nomA = sc.next();
                    Animal_A_Affecter = zoo.chercherAnimal(nomA);
                    if(Animal_A_Affecter==null){
                        System.out.println("Aucun animal trouvé avec ce nom");
                        break ;
                    }
                    leSoigneur_A_Affecter.nourrirAnimal(Animal_A_Affecter);
                    System.out.println("Tâche effectué avec succès !");
                    break ;
                case 9 :
                    System.out.println("Nom du soigneur : ");
                    nomS = sc.next();
                    leSoigneur_A_Affecter =  zoo.chercherSoigneur(nomS);

                    if(leSoigneur_A_Affecter==null){
                        System.out.println("Aucun soigneur trouver avec ce nom");
                        break ;
                    }

                    System.out.println("Nom de l'animal : ");
                    nomA = sc.next();
                    Animal_A_Affecter = zoo.chercherAnimal(nomA);
                    if(Animal_A_Affecter==null){
                        System.out.println("Aucun animal trouvé avec ce nom");
                        break ;
                    }
                    leSoigneur_A_Affecter.diagnostic(Animal_A_Affecter);
                    System.out.println("\nTâche effectué avec succès !");
                    break ;

                    case 10 :
                        System.out.println("Nom du soigneur : ");
                        nomS = sc.next();
                        leSoigneur_A_Affecter =  zoo.chercherSoigneur(nomS);

                        if(leSoigneur_A_Affecter==null){
                            System.out.println("Aucun soigneur trouver avec ce nom");
                            break ;
                        }

                        System.out.println("Nom de l'animal : ");
                        nomA = sc.next();
                        Animal_A_Affecter = zoo.chercherAnimal(nomA);
                        if(Animal_A_Affecter==null){
                            System.out.println("Aucun animal trouvé avec ce nom");
                            break ;
                        }
                        leSoigneur_A_Affecter.soigner(Animal_A_Affecter);
                        System.out.println("\nTâche effectué avec succès !");
                        break ;

            }

        }while (ouvert);
    }
}
