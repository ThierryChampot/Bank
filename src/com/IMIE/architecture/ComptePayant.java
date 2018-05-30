package com.IMIE.architecture;

public class ComptePayant extends Compte {

    protected float decouvert;

    public ComptePayant() {
        super();
        this.code = super.NOMBRE_COMPTES;
        this.decouvert = 0;
        this.operationDepot = new operationDepotPayante();
        this.operationRetrait = new operationRetraitPayante();
    }
}
