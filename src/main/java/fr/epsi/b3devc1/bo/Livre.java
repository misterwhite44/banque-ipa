package fr.epsi.b3devc1.bo;

import jakarta.persistence.*;

@Entity
@Table(name = "LIVRE")
public class Livre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "TITRE", nullable = false)
    private String titre;

    @Column(name = "AUTEUR", nullable = false)
    private String auteur;

    // ✅ Constructeurs
    public Livre() {}

    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    // ✅ GETTERS & SETTERS
    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
}
