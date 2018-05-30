package com.IMIE.architecture;

public class operationRetraitPayante implements OperationRetrait {

    public operationRetraitPayante() {
    }

    @Override
    public Compte effectueRetrait(float montant, Compte compte) {
        if ( montant <= compte.solde) {
            compte.solde -= montant ;
            float frais = 5 * montant / 100;
            compte.solde -= frais;
            System.out.println("Opération effectuée avec succès : " + this.getClass().getName() + " de " +  montant );
            System.out.println("Frais facturés : " +  frais );
        } else {
            System.out.println("Opération refusée : " + this.getClass().getName() + " pour cause de " +  "solde insuffisant" );
        }
        return compte;
    }
}
