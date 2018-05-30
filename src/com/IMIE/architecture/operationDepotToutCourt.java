package com.IMIE.architecture;

public class operationDepotToutCourt implements OperationDepot {

        @Override
        public Compte effectueDepot(float montant, Compte compte) {
            if ( montant <= compte.solde)
            {
                System.out.println("Opération effectuée avec succès : " + this.getClass().getName() + " de " +  montant );
            } else {
                System.out.println("Opération refusée : " + this.getClass().getName() + " pour cause de " +  "montant insuffisant" );
            }
            return compte;
        }
    }
