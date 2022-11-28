package domaine;

import java.io.Serializable;
import java.util.ArrayList;

public class Agence implements Serializable
{
    private String codeag ;
    private String nomag ;

    private ArrayList<Client> lclients;

    public Agence(String codeag, String nomag)
    {
        lclients = new ArrayList<Client>();
        this.codeag = codeag;
        this.nomag = nomag;
    }

    public String getCodeag() {
        return codeag;
    }

    public void setCodeag(String codeag) {
        this.codeag = codeag;
    }

    public String getNomag() {
        return nomag;
    }

    public void setNomag(String nomag) {
        this.nomag = nomag;
    }

    public ArrayList<Client> getLclients() {
        return lclients;
    }

    public void setLclients(ArrayList<Client> lclients) {
        this.lclients = lclients;
    }

    public void addClient(Client c){
        lclients.add(c);
    }
}

