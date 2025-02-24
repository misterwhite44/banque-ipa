package fr.epsi.b3devc1.bo;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class CompteAssuranceVie extends Compte {
    private double taux;
    private LocalDate dateFin;

    public CompteAssuranceVie() {}

    public CompteAssuranceVie(String numero, double solde, double taux, LocalDate dateFin) {
        super(numero, solde);
        this.taux = taux;
        this.dateFin = dateFin;
    }
}
