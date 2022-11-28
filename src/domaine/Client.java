package domaine;

import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable {
    private int numcli;
    private String nomcli;
    private String prenomcli;
    private Agence agence;
    private static int inc=0;
    private ArrayList<Compte> lcomptes;

    public Client(String nomcli, String prenomcli)
    {
        inc ++;
        numcli= inc;
        this.nomcli = nomcli;
        this.prenomcli = prenomcli;
        lcomptes = new ArrayList<Compte>();
    }

    public int getNumcli() {
        return numcli;
    }

    public void setNumcli(int numcli) {
        this.numcli = numcli;
    }

    public String getNomcli() {
        return nomcli;
    }

    public void setNomcli(String nomcli) {
        this.nomcli = nomcli;
    }

    public String getPrenomcli() {
        return prenomcli;
    }

    public void setPrenomcli(String prenomcli) {
        this.prenomcli = prenomcli;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public ArrayList<Compte> getLcomptes() {
        return lcomptes;
    }

    public void setLcomptes(ArrayList<Compte> lcomptes) {
        this.lcomptes = lcomptes;
    }

}
