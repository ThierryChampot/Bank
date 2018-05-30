package com.IMIE.architecture;

public class operationDepotSimple implements OperationDepot {

    public operationDepotSimple() {
        super();
    }

    @Override
    public Compte effectueDepot(float montant, Compte compte) {
        if (compte.decouvert >= 0 ) {
            if (montant >= compte.decouvert ) {
                montant -= compte.decouvert;
                compte.decouvert = 0;
            } else {
                compte.decouvert -= montant;
                montant = 0;
            }
        } else {
            compte.solde -= compte.decouvert;
            compte.decouvert = 0;
        }
        compte.solde += montant;
        System.out.println("Opération effectuée avec succès : " + this.getClass().getName() + " de " + montant);
        return compte;
    }
}
