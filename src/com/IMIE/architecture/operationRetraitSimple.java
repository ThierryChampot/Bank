package com.IMIE.architecture;

public class operationRetraitSimple implements OperationRetrait {

    public operationRetraitSimple() {
    }

    @Override
    public Compte effectueRetrait(float montant, Compte compte) {
        if ( montant <= compte.solde + compte.decouvert) {
            compte.solde -= montant ;
            System.out.println("Opération effectuée avec succès : " + this.getClass().getName() + " de " +  montant );
        } else {
            System.out.println("Opération refusée : " + this.getClass().getName() + " pour cause de " +  "montant insuffisant" );
        }
        return compte;
    }
}
