package fr.epsi.b3devc1;

import fr.epsi.b3devc1.dao.JpaUtil;
import fr.epsi.b3devc1.bo.*;

import jakarta.persistence.EntityManager;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JpaUtil.getEntityManager();
        em.getTransaction().begin();

        // Création des clients
        Client client1 = new Client("Durand", "Paul");
        Client client2 = new Client("Martin", "Sophie");

        // Création des comptes
        Compte compte1 = new CompteLivretA("12345", 5000.0, 0.02);
        Compte compte2 = new CompteAssuranceVie("67890", 10000.0, 0.03, LocalDate.of(2030, 12, 31));

        client1.ajouterCompte(compte1);
        client1.ajouterCompte(compte2);
        client2.ajouterCompte(compte1);

        em.persist(client1);
        em.persist(client2);
        em.persist(compte1);
        em.persist(compte2);

        // Opérations
        Operation op1 = new Virement(LocalDate.now(), -500, compte1, "Dupont");
        Operation op2 = new Virement(LocalDate.now(), -200, compte2, "Lemoine");

        em.persist(op1);
        em.persist(op2);

        em.getTransaction().commit();
        em.close();
        JpaUtil.close();

        System.out.println("Données insérées avec succès !");
    }
}
