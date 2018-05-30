package com.IMIE.architecture;

import java.util.List;

public class Agence {
    private static int NOMBRE_AGENCES;

    private int code;
    private String address;
    private List<Compte> comptes;

    public Agence() {
        this.NOMBRE_AGENCES += 1;
        this.code = NOMBRE_AGENCES;
    }

    public int getCode() {
        return this.code;
    }

    public void SetAdress(String address) {
        this.address = address;
    }

    public void AddCompte(Compte compte) {
        if (this.comptes.contains(compte)) {
            System.out.println("L'agence gere deja ce compte.");
            compte.codeAgence = this.code;
        } else {
            if (compte.codeAgence > 0) {
                System.out.println("Le compte fait partie du portefeuille de l'agence " + compte.codeAgence);
                System.out.println("Merci de retirer le compte de l'agence " + compte.codeAgence + " avant de l'ajouter à celle-ci");
            } else {
                System.out.println("Le compte n'est dans le portefeuille d'aucune agence.");
            }
            this.comptes.add(compte);
            compte.codeAgence = this.code;
            System.out.println("Le compte a ete ajoute au portefeuille de l'agence." + this.code);
        }
    }

    public void RemoveCompte(Compte compte) {
        if (this.comptes.contains(compte)) {
            this.comptes.remove(compte);
            compte.codeAgence = 0;
            System.out.println("Le compte a ete retire du portefeuille de l'agence.");
        } else {
            System.out.println("Le compte ne fait pas partie du portefeuille de l'agence.");
        }
    }
}
