package fr.epsi.b3devc1.dao;

import fr.epsi.b3devc1.bo.Emprunt;
import fr.epsi.b3devc1.bo.Client;
import fr.epsi.b3devc1.bo.Livre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmpruntDAO {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa");

    // 🔹 Recherche d'un emprunt par ID et affichage des livres associés
    public static void afficherEmpruntParId(int idEmprunt) {
        EntityManager em = emf.createEntityManager();

        Emprunt emprunt = em.find(Emprunt.class, idEmprunt);

        if (emprunt != null) {
            System.out.println("Emprunt ID: " + emprunt.getId());
            System.out.println("Date début: " + emprunt.getDateDebut());
            System.out.println("Livres associés:");
            for (Livre livre : emprunt.getLivres()) {
                System.out.println(" - " + livre.getTitre() + " de " + livre.getAuteur());
            }
        } else {
            System.out.println("Aucun emprunt trouvé pour l'ID: " + idEmprunt);
        }

        em.close();
    }

    // 🔹 Recherche des emprunts d’un client donné
    public static void afficherEmpruntsParClient(int idClient) {
        EntityManager em = emf.createEntityManager();

        Client client = em.find(Client.class, idClient);

        if (client != null) {
            System.out.println("Client: " + client.getNom() + " " + client.getPrenom());
            for (Emprunt emprunt : client.getEmprunts()) {
                System.out.println("Emprunt ID: " + emprunt.getId() + ", Date début: " + emprunt.getDateDebut());
            }
        } else {
            System.out.println("Aucun client trouvé pour l'ID: " + idClient);
        }

        em.close();
    }
}
