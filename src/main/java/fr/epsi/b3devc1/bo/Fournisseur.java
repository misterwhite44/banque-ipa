package fr.epsi.b3devc1.bo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;


@Entity
public class Fournisseur implements Serializable {
    @Id
    private Integer id;
    private String raisonSociale;
    private String siret;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public String getSiret() {
        return siret;
    }

    public void setSiret(String siret) {
        this.siret = siret;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
}
