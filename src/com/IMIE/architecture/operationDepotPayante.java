package com.IMIE.architecture;

public class operationDepotPayante implements OperationDepot {
    public operationDepotPayante() {
    }

    @Override
    public Compte effectueDepot(float montant, Compte compte) {
            compte.solde += montant ;
            float frais = 5 * montant / 100;
            compte.solde -= frais;
            System.out.println("Opération effectuée avec succès : " + this.getClass().getName() + " de " +  montant );
            System.out.println("Frais facturés : " +  frais );

        return compte;
    }
}
