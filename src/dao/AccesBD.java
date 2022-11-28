package dao;

import domaine.*;
import java.util.*;

public class AccesBD {
    private ArrayList<Client> listecli = new ArrayList<Client>();
    private ArrayList<Agence> listeag = new ArrayList<Agence>();

    public Agence searchAgence(String numag) {
        Agence ag=null;
        for (Agence x: listeag){
            if (x.getCodeag().equals(numag))
                ag=x;
        }
        return ag;
    }

    private  void saveClient(Client c, String numag){
        Agence ag = searchAgence(numag);
        if (ag == null)
            System.out.println("Numero d'agence inexistant !!!");
        else {
            c.setAgence(ag);
            ag.addClient(c);
            listecli.add(c);
        }
    }

}
