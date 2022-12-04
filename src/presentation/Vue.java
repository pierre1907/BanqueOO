package presentation;

import domaine.*;
import dao.AccesBD;

import java.util.Scanner;


public class Vue {
    //injection de dependance en creant une instance de la dao
    private static AccesBD bd= new AccesBD();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        Agence ag = null;
        String nomCli, prenomCli, codeAg, nomAg, numAg;
        do{
            System.out.println("1. Creer une agence");
            System.out.println("2. Lister les agences");
            System.out.println("3. Creer un client");
            System.out.println("4. Lister les clients de la banque");
            System.out.println("5. Lister les clients d'une agence ");
            System.out.println("6. Exit/Sortie");
            System.out.println("Votre choix ?");

            choix=sc.nextInt();
            sc.nextLine();
            switch (choix){
                case 1 :
                    System.out.println("Code de l'agence ? ");
                    codeAg= sc.nextLine();
                    System.out.println("Nom de l'agence ?");
                    nomAg= sc.nextLine();
                    ag = new Agence(codeAg, nomAg);
                    bd.createAg(ag);
                    break;
                case 2:
                    bd.listAg();
                    break;
                case 3 :
                    System.out.println("Numéro de l'agence ? ");
                    numAg=sc.nextLine();
                    ag = bd.searchAgence(numAg);
                    if (ag==null)
                        System.out.println("Agence inexistante");
                    else  {
                        do {
                            System.out.println("Nom client ? ");
                            nomCli = sc.nextLine();
                            if (nomCli.length() == 0)
                                System.out.println("Nom obligatoire");
                        }while (nomCli.length() == 0);
                        System.out.println("Nom client ? ");
                        nomCli= sc.nextLine();
                        System.out.println("Prenom du client ?");
                        prenomCli= sc.nextLine();
                        Client c = new Client(nomCli,prenomCli);
                        bd.saveClient(c, ag);
                    }
                    break;
                case 4:
                    bd.listAg();
                    break;
                case 5 :
                    System.out.println("Numéro de l'agence ? ");
                    numAg=sc.nextLine();
                    bd.listerClientsAgence(numAg);
                    break;
                case 6:
                    break;
            }

        }while(choix!=6);
            System.out.println("A bientôt !!! Merciiii");
    }
}
