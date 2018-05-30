package com.IMIE.architecture;

public class CompteSimple extends Compte {

    protected float decouvert;

    public CompteSimple() {
        super();
        this.code = super.NOMBRE_COMPTES;
        this.decouvert = 0;
        this.operationDepot = new operationDepotSimple();
        this.operationRetrait = new operationRetraitSimple();
    }

    public CompteSimple(float decouvert) {
        super();
        this.decouvert = decouvert;
    }
}
