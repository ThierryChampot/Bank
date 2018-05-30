package com.IMIE.architecture;

public abstract class Compte {
    protected static int NOMBRE_COMPTES = 0;

    protected OperationRetrait operationRetrait;
    protected OperationDepot operationDepot;
    protected int code;
    protected int codeAgence;
    protected float solde;
    public float decouvert;

    public Compte() {
        this.NOMBRE_COMPTES += 1;
    }

    public void effectueRetrait(float montant) {
        this.operationRetrait.effectueRetrait(montant, this);
    }

    public void effectueDepot(float montant) {
        this.operationRetrait.effectueRetrait(montant, this);
    }
}
