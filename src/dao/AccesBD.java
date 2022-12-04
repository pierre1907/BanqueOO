package dao;

import domaine.*;
import java.util.*;

public class AccesBD {
    private ArrayList<Client> listecli = new ArrayList<Client>();
    private ArrayList<Agence> listeag = new ArrayList<Agence>();

    //recherche d'une agence
    public Agence searchAgence(String numag) {
        Agence ag=null;
        for (Agence x: listeag){
            if (x.getCodeag().equals(numag))
                ag=x;
            break;
        }
        return ag;
    }

    //creation de client
    public void saveClient(Client cl,Agence ag){
        cl.setAgence(ag);
        ag.getLclients().add(cl);
        listecli.add(cl);
    }

    //creation d'agence
    public void createAg(Agence ag){
        listeag.add(ag);
    }

    //lister les agences
    public void listAg(){
        for (Agence t : listeag)
        {
            System.out.println("________________________________");
            System.out.println("Code agence: " +t.getCodeag());
            System.out.println("Nom agence: "+t.getNomag());
        }
        System.out.println("________________________________");

    }

    //lister les clients
    public void listCl(String numag ){
        Agence ag= searchAgence(numag);
        if(ag==null)
            System.out.println("Numero d'agence inexistant !!!!");
        else {
            ArrayList<Client> lc = ag.getLclients();
            if (lc.size() == 0)
                System.out.println("Liste de client vide");
            else {
                for (Client t : listecli) {
                    System.out.println("________________________________");
                    System.out.println("Numero client: " + t.getNumcli());
                    System.out.println("Nom client: " + t.getNomcli());
                    System.out.println("Prenom client: " + t.getPrenomcli());
                    System.out.println("Agence du client: " + t.getAgence().getNomag());
                }
                System.out.println("________________________________");
            }
        }
    }

    public void listerClientsAgence(String num){
        Agence ag = searchAgence(num);
        if(ag!=null){
            if (ag.getLclients().size()==0){
                System.out.println("Liste des clients vides");
            }else{
                for(Client x: ag.getLclients()){
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Numero : "+x.getNumcli());
                    System.out.println("Nom : "+x.getNomcli());
                    System.out.println("Prenom : "+x.getPrenomcli());
                    System.out.println("Nom Agence : "+ag.getNomag());
                }
                System.out.println("-----------------------------------------------------");
            }
        }else{
            System.out.println("Agence inexistante !!!");
        }
    }

}
