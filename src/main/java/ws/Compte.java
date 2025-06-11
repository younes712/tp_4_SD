package ws;

import java.time.LocalDate;
import java.util.Date;

public class Compte {
    private int compteId;
    private double solde;
    private Date dateCreation;

    public Compte(int compteId, double solde,Date dateCreation) {
        this.compteId = compteId;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    public void setCompteId(int compteId) {
        this.compteId = compteId;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getCompteId() {
        return compteId;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }
}
