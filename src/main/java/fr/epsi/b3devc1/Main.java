package fr.epsi.b3devc1;

import fr.epsi.b3devc1.dao.EmpruntDAO;

public class Main {
    public static void main(String[] args) {
        EmpruntDAO.afficherEmpruntParId(1);
        EmpruntDAO.afficherEmpruntsParClient(2);
    }
}
