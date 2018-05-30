package com.IMIE.architecture;

import java.util.Date;

public class CompteEpargne extends Compte {
    protected float tauxInteret;

    public CompteEpargne(float tauxInteret) {
        super();
        this.tauxInteret = tauxInteret;
        this.operationDepot = new operationDepotToutCourt();
        this.operationRetrait = new operationRetraitToutCourt();
    }

    public void calculInteret() {
        float montantInterets = this.solde * this.tauxInteret /100;
        System.out.println("Montant des interets annuels pour ce solde = " + montantInterets);
        this.solde += montantInterets;
    }
}
